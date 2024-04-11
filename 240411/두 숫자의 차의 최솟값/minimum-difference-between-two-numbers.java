import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[1] - arr[0];

        for (int i = 2; i < n; i++) {
            if (min > arr[i] - arr[i-1]) {
                min = arr[i] - arr[i-1];
            }
        }
        System.out.print(min);
    }
}