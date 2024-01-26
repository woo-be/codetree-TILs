import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = 0;
        if (a < b && a < c) {
            System.out.println(a);
        }
        if (b < a && b < c) {
            System.out.println(b);
        }
        if (c < a && c < b) {
            System.out.println(c);
        }
        
    }
}