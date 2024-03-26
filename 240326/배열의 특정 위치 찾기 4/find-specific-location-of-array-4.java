import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        for (int i = 0 ; i < 10; i++) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            } else if (input % 2 == 0) {
                arr[i] = input;
                sum += input;
                cnt++;
            }
        }

        System.out.print(cnt + " " + sum);
        
    }
}