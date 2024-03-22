import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i <= n; i++) {
            int temp = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.print(i + " ");
            }
        }
    }
}