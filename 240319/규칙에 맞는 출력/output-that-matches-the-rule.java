import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(n - i + j + " ");
            }
            System.out.println();
        }
    }
}

// n = 5
//  i\j 0 1 2 3 4
//   0  5
//   1  4 5
//   2  3 4 5
//   3  2 3 4 5
//   4  1 2 3 4 5
//
//