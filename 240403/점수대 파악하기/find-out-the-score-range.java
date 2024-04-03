import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int[] countArr = new int[11];
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            arr[i] = input;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            countArr[arr[i] / 10]++;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d - %d\n",10 * i, countArr[i]);
        }
    }
}