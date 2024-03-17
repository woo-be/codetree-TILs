import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print(i * n + j + 1 + " ");
                } else {
                    System.out.print((i + 1) * n - j + " ");
                }
            }
            System.out.println();
        }
    }
}

// n = 4
// i/j 0 1 2 3 
//  0  1 2 3 4
//  1  8 7 6 5
//  2  9 10 11 12
//  3 16 15 14 13
//  i % 2 == 0 : i * n + j + 1
//  i % 2 != 0 : (i+1) * n - j
//
//