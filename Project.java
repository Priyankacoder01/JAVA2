import java.util.*;

public class Project {
    private int n; // number of players
    private int m; // points to accumulate
    private List<Player> players; // list of players
    private int currentPlayerIndex; // index of the current player
    
    public Project(int n, int m) {
        this.n = n;
        this.m = m;
        this.players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(new Player("Player-" + i));
        }
        Collections.shuffle(players); // randomly assign order
        this.currentPlayerIndex = 0;
    }
    
    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.printf("%s, it's your turn (press 'r' to roll the dice)%n", currentPlayer.getName());
            if (scanner.nextLine().equals("r")) {
                int points = rollDice();
                System.out.printf("You rolled a %d%n", points);
                currentPlayer.addPoints(points);
                printRankTable();
                if (points == 6) {
                    System.out.println("Congratulations, you get another chance!");
                } else if (currentPlayer.isPenalized()) {
                    System.out.println("Oops, you rolled a 1 twice consecutively and are penalized.");
                    currentPlayer.setPenalized(false);
                } else {
                    currentPlayerIndex = (currentPlayerIndex + 1) % n;
                }
            }
        }
        for (Player player : players) {
            if (player.getPoints() >= m) {
                int rank = getRank(player);
                System.out.printf("%s, you completed the game and are ranked #%d%n", player.getName(), rank);
            }
        }
    }
    
    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
    
    private boolean isGameOver() {
        return players.stream().allMatch(player -> player.getPoints() >= m);
    }
    
    private void printRankTable() {
        players.sort(Collections.reverseOrder());
        System.out.println("Rank table:");
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            int rank = i + 1;
            System.out.printf("%d. %s (%d points)%n", rank, player.getName(), player.getPoints());
        }
    }
    
    private int getRank(Player player) {
        int rank = 1;
        for (Player other : players) {
            if (other != player && other.getPoints() > player.getPoints()) {
                rank++;
            }
        }
        return rank;
    }
    
    private static class Player implements Comparable<Player> {
        private String name;
        private int points;
        private boolean penalized;
        
        public Player(String name) {
            this.name = name;
            this.points = 0;
            this.penalized = false;
        }
        
        public String getName() {
            return name;
        }
        
        public int getPoints() {
            return points;
        }
        
        public void addPoints(int points) {
            this.points += points;
            if (points == 1) {
                penalized = !penalized; // toggle penalty status
            } else {
                penalized = false;
            }
        }
        
        public boolean isPenalized() {
            return penalized;
        }
        
        public void setPenalized(boolean penalized) {
            this.penalized = penalized;
        }
        @Override
        public int compareTo(Player other) {
            return Integer.compare(points, other.points);
        }
    }
    
    public static void main(String[] args) {
        // if (args.length != 2) {
        //     System.err.println("Usage: java TheGame <number of players> <points to accumulate>");
        //     System.exit(1);
        // }
        // int n = Integer.parseInt(args[0]);
        // int m = Integer.parseInt(args[1]);
        Project game = new Project(4, 20);
        game.play();
}
}