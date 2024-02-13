import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                if(i % 100 == 0 && i % 400 != 0) {
                    continue;
                }
                count++;
            }
        }
        System.out.print(count);
    }
}