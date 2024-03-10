import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0 ; i < 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < i / 2 + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int k = 0; k < n - i / 2; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}

// n = 5         
// i            *
// 0 *          1
// 1 * * * * *  5
// 2 * *        2
// 3 * * * *    4
// 4 * * *      3
// 5 * * *      3
// 6 * * * *    4
// 7 * *        2
// 8 * * * * *  5
// 9 *          1
// i짝수: *= 1 + (i / 2), i홀수: *= n - (i/2)