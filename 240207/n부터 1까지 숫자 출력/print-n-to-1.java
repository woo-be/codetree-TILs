import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}