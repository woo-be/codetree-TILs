import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int min = minimum(a, minimum(b, c));
        if (a == min) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        if (a == b && a == c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    static int minimum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }          
    }
}