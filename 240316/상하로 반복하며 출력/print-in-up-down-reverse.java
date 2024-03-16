import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(i + 1);
                } else {
                    System.out.print(n - i);
                }
            }
            System.out.println();
        }
    }
}

// n = 5
// i\j 0 1 2 3 4
//  0  1 5 1 5 1
//  1  2 4 2 4 2
//  2  3 3 3 3 3
//  3  4 2 4 2 4
//  4  5 1 5 1 5
//