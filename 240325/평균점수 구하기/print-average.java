import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[8];
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < 8; i++) {
            arr[i] = in.nextDouble();
            sum += arr[i];
        }
        avg = sum / 8;
        System.out.printf("%.1f", avg);
    }
}