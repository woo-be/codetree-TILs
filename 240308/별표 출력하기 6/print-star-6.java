import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            // 공백
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 별
            for (int k = 0; k < (2 * n) - (2 * i) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            // 공백
            for (int j = 0; j < n - 2 - i; j++) {
                System.out.print("  ");
            }
            // 별
            for (int k = 0; k < 3 + (2 * i); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

// n = 4
// i                v *
// 0 * * * * * * *  0 7
// 1 v * * * * *    1 5
// 2 v v * * *      2 3
// 3 v v v *        3 1
// v = i, * = (2 * n) - (2 * i) - 1
// -----------------------
// 0 v v * * *      2 3 
// 1 v * * * * *    1 5 
// 2 * * * * * * *  0 7 
// v = n - 2 - i, * = 3 + 2 * i