import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[2][4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            int sum1 = 0;
            double avg1 = 0;
            for (int j = 0; j < 4; j++) {
                sum1 += arr[i][j];
            }
            avg1 = sum1 / 4;
            System.out.print(avg1 + " ");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            int sum2 = 0;
            double avg2 = 0;
            for (int j = 0; j < 2; j++) {
                sum2 += arr[j][i];
            }
            avg2 = sum2 / 2;
            System.out.print(avg2 + " ");
        }
        System.out.println();

        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
        }
        avg = sum / 8;
        System.out.print(avg);
    }
}