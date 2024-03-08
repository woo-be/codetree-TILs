import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int space = 0;
        int star = 2 * n - 1;
        for (int i = 0; i < 2 * n - 1; i++) {
            // 공백
            for(int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            // 별
            for (int k = 0; k < star; k++) {
                System.out.print("* ");
            }
            System.out.println();

            if (i < n-1) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }
        }
    }
}

// i             v *
// 0 * * * * *   0 5
// 1 v * * *     1 3
// 2 v v *       2 1
// 3 v * * *     1 3
// 4 * * * * *   0 5
//   v =