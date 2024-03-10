import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n - i / 2; j++) {
                    System.out.print("* ");
                }   
                System.out.println();
            } else {
            for (int k = 0; k < i / 2 + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
            }
        }
    }
}
// n = 5
// i            *
// 0 * * * * *  5
// 1 *          1
// 2 * * * *    4
// 3 * *        2
// 4 * * *      3
// 5 * * *      3
// 6 * *        2
// 7 * * * *    4
// 8 *          1
// 9 * * * * *  5
// (i짝수): *= n - (i / 2), (i홀수): *= 1 + (i / 2)