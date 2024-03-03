import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                for (int k = n - i; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// i               별
// 0 *** *** ***   3 * 3
// 1 ** **         2 * 2
// 2 *             1 * 1
//                 3 - i