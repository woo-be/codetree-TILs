import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    count++;
                    continue;
                }
                if (i % 3 == 0) {
                    count++;
                    continue;
                }
                if (i % 5 == 0) {
                    count++;
                    continue;
                }
            }
            System.out.print(n - count);
    }
}