import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 2 * n - 1;
        int space = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cnt; j++) {
                System.out.print("* ");
            }
            System.out.println();

            cnt -= 2;
            space += 2;
        }
    }
}