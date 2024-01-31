import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
                System.out.println(a);
        }
        if ((b > a && b < c) || (b > c && b < a)) {
                System.out.println(b);
        }
        if ((c > a && c < b) || (c > b && c < a)) {
                System.out.println(c);
        }
    }
}