public class q1{
    public static void main(String[] args) {
        String input = "EW AAJV VOEL";
        String output = rearrangeString(input);
        System.out.println("Input: " + input);
        System.out.println("string after arranging : " + output);
    }

    public static String rearrangeString(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.contains("W") || word.contains("V")) {
                sb.append(word).append(" ");
            }
        }
        for (String word : words) {
            if (!word.contains("W") && !word.contains("V")) {
                sb.append(word).append(" ");
            }
        }
        return sb.toString().trim();
    }
}