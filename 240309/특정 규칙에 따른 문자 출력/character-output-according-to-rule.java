import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
// n = 4
// i          v @
// 0 v v v @  3 1
// 1 v v @ @  2 2
// 2 v @ @ @  1 3
// 3 @ @ @ @  0 4
// v = (n-1) - i, @ = 1 + i
// --------------------
// 0 @ @ @ v    3
// 1 @ @ v v    2
// 2 @ v v v    1
// @ = (n-1) - i