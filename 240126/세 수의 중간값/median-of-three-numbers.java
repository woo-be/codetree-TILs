import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (b > a && b < c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}