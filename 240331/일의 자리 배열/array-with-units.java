import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[11];
        arr[0] = in.nextInt();
        arr[1] = in.nextInt();
        for (int i = 3; i < 11; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}