import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0 ; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("*");
            } else {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");                }
                System.out.println();
            }
        }
    }
}

// n = 6
// i             *v
// 0 *           
// 1 *v*         2
// 2 *
// 3 *v*v*v*     4
// 4 *
// 5 *v*v*v*v*v* 6
// *v = 1 + i