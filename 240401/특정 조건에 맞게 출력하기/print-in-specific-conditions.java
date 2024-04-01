import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[101];
        int cnt = 0;
        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input += 3;
            }
            arr[cnt] = input;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}