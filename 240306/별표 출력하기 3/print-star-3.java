import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int k = (2 * n - 1) - 2 * i; k > 0; k-- ) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// i            s  *
// 0 * * * * *  0  5
// 1   * * *    2  3
// 2     *      4  1
//             i*2 5-2*i