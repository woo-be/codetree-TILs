import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            // 왼쪽 별
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 왼쪽 공백
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            // 오른쪽 공백
            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            // 오른쪽 별
            for (int l = 0; l < n - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// i         * s s *
// 0 ******  3 0 0 3
// 1 **  **  2 1 1 2
// 2 *    *  1 2 2 1
// * = n - i | s = i