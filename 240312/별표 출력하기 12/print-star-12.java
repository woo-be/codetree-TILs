import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    if (i == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (i <= j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}

// n = 5
// i\j 0 1 2 3 4 5    *
// 0   * * * * * *    5
// 1     *   *   *    3
// 2         *   *    2
// 3         *   *    2
// 4             *    1
// 5             *    1
//
//