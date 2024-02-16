import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            if (num >= 0 && num <= 200) {
                sum += num;
                count++;
            }
        }
        System.out.printf("%d %.1f", sum, (double) sum / count);
    }
}