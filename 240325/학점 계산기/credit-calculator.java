import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextDouble();
            sum += arr[i];
        }
        avg = sum / n;
        System.out.printf("%.1f\n", avg);
        if (avg >= 4) {
            System.out.print("Perfect");
        } else if (avg >= 3) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }
    }
}