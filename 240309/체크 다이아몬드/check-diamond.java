import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// n = 5
// i            v  *v
// 0 vvvv*      4  1
// 1 vvv*v*     3  2
// 2 vv*v*v*    2  3
// 3 v*v*v*v*   1  4
// 4 *v*v*v*v*  0  5
// v = (n-1) - i, *v = i + 1
// ---------------------------
// 0 v*v*v*v*   1  4
// 1 vv*v*v*    2  3
// 2 vvv*v*     3  2
// 3 vvvv*      4  1
// v = 1 + i, *v = (n-1) - i
//
//