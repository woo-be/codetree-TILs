import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr1[i] % 2 == 0) {
                arr2[cnt] = arr1[i];
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}