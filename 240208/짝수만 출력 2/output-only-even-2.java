import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a = in.nextInt();
        while (b >= a) {
            System.out.print(b + " ");
            b -= 2;
        }
    }
}