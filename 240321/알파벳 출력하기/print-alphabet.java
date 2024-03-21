import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) cnt);
                cnt++;
                if (cnt == 91) {
                    cnt = 65;
                }
            }
            System.out.println();
        }
    }
}