import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print(n - j + " ");
                }
            }
            System.out.println();
        }
    }
}

// n = 4
// i\j 0 1 2 3
//  0  4 3 2 1
//  1  v 3 2 1
//  2  v v 2 1
//  3  v v v 1
//
//
//