import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int sum = 0;
        float avg = 0;
        for (int i = 0 ; i < 10; i++) {
            arr[i] = in.nextInt();
            if (arr[i] >= 250) {
                break;
            }
            cnt++;
        }
        
        for (int i = 0; i < cnt; i++) {
            sum += arr[i];
        }

        avg = (float) sum / cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}