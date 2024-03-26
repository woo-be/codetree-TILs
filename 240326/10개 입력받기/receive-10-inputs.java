import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < 10; i++) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            arr[i] = input;
            sum += arr[i];
            cnt++;
        }

        avg = (double) sum / cnt;
        
        System.out.printf("%d %.1f", sum, avg);
    }
}