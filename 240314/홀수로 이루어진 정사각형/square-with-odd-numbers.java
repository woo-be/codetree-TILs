import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(10 + (i - 1) * 2 + (j * 2 - 1) + " ");
            }
            System.out.println();
        }
    }
}

// n = 5
// i\j 1  2  3  4  5  
//   1 11 13 15 17 19
//   2 13 15 17 19 21
//   3 15 17 19 21 23
//   4 17 19 21 23 25
//   5 19 21 23 25 27
//   
//
//