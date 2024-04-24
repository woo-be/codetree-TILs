import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int num = 1;
        int[][] arr = new int[n][n];

        for (int i = 0; i < m; i++) {
            int r = in.nextInt();
            int c = in.nextInt();
            arr[r-1][c-1] = num++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}