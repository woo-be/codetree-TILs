import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    System.out.print("* ");
                    continue;
                }
                if (i <= j && j <= n-2) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// n = 6
// i\j 0 1 2 3 4 5
// 0   * * * * * *
// 1   *         *  
// 2   * *       *  
// 3   * * *     *  
// 4   * * * *   *  
// 5   * * * * * *
//     i=1, j=1~4
//     i=2, j=2~4
//     i=3, j=3~4
//     i=4, j=4~4
//
//