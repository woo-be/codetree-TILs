import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            int i = in.nextInt();
            if (i >= 30 || i <= 19) {
                break;
            }
            sum += i;
            count++;
        }
        System.out.printf("%.2f", (double) sum / count);
    }
}