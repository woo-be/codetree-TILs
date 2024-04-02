import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt = 0;
        int[] countArr = new int[10];
        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            arr[cnt] = input;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            countArr[arr[i] / 10]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }
        
    }
}