import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            arr[i] = input;
            cnt++;
        }
        
        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}