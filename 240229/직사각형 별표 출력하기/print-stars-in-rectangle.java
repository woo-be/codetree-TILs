import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int j = 0; j < n; j++) {
        for (int i = 0; i < m; i++) {
            System.out.print("* ");
        }
        System.out.println();
        }
    }
}