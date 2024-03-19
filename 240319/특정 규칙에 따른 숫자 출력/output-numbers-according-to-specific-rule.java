import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print(cnt + " ");
                    cnt++;
                    if (cnt == 10) {
                        cnt = 1;
                    }
                }
            }
            System.out.println();
        }
    }
}

// n = 4
// i\j 0 1 2 3
//  0  1 2 3 4
//  1  v 5 6 7
//  2  v v 8 9
//  3  v v v 1
//
//
//