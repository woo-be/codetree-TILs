import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum >= n) {
                num = i;
                break;
            }
        }
        System.out.print(num);
    }
}