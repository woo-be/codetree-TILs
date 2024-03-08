import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < 1 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            // 공백
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            // 별
            for (int k = 0; k < (2 * n) - 3 - (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// n = 4
// i           v *
// 0 vvv*      3 1
// 1 vv***     2 3
// 2 v*****    1 5
// 3 *******   0 7
// v = n - i - 1, * = 1 + 2 * i
// ------------
// 0 v*****    1 5
// 1 vv***     2 3
// 2 vvv*      3 1
// v = i + 1, * = (2 * n) - 3 - (2 * i)
// n  *
// 1  0
// 2  1
// 3  3
// 4  5
// 5  7
// 6  9