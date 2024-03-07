import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int space = 2 * (n - 1);
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < space - 2 * i; j++) {
                System.out.print(" ");
            }
            // 별표
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
     }
}

// i              s *
// 0     *        4 1
// 1   * * *      2 3
// 2 * * * * *    0 5
//   s = 2*(n - 1) - 2i | * = 2*i + 1