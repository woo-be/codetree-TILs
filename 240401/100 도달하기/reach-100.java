import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000];
        arr[0] = 1;
        arr[1] = in.nextInt();
        int cnt = 2;
        while (true) {
            arr[cnt] = arr[cnt - 1] + arr[cnt - 2];
            if (arr[cnt] > 100) {
                break;
            }
            cnt++;
        }

        for (int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}