import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = 0;
        int[] arr = new int[100];
        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            arr[cnt] = input;
            cnt++;
        }

        System.out.print(arr[cnt - 1] + arr[cnt - 2] + arr[cnt - 3]);
        
    }
}