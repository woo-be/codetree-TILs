import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[1001];
        int max = -1;
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            arr[i] = temp;
            countArr[temp]++;
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            if (countArr[temp] > 1) {
                continue;
            }
            if (temp > max) {
                max = temp;
            }
        }

        System.out.print(max);
    }
}