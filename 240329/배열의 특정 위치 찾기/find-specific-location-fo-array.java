import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i < 10; i += 2) {
            sum1 += arr[i];
        }

        for (int i = 2; i < 10; i += 3) {
            sum2 += arr[i];
        }
        avg = (double) sum2 / 3;

        System.out.printf("%d %.1f", sum1, avg);
    }
}