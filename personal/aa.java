import java.util.Scanner;
public class aa{
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("enter the number e:");
        num =sc.nextInt();
        for (int i =0; i<10;i++){
            int ans=num*i;
            System.out.println(num + "*" + i "=" +ans);
            // i++;
        }
    }
}