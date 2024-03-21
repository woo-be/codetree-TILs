import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print((char) cnt + " ");
                    cnt++;
                    if (cnt == 91) {
                        cnt = 65;
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// n = 3
// i\j 1 2 3
//  1  A B C
//  2  v D E 
//  3  v v F
//
//
//