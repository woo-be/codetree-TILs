import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int size = n;
        while(true) {
            int max = 0;
            int index = 0;
            int temp_size = 0;
            for (int i = 0; i < size; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    temp_size = i;
                    index = i + 1;
                }
            }
            size = temp_size;
            System.out.print(index + " ");
            if (index == 1) {
                break;
            }
        }
    }
}