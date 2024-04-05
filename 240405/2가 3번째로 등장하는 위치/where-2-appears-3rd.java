import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int cnt = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                cnt++;
            }
            if (cnt == 3) {
                index = i;
                break;
            }
        }
        System.out.println(index + 1);

    }
}