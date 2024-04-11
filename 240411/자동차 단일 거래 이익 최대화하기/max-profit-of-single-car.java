import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = in.nextInt();
        }

        int min = price[0];
        int max = 0;
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (price[i] < min) {
                min = price[i];
                minIndex = i;
            }
        }

        for (int i = minIndex; i < n; i++) {
            if (price[i] > max) {
                max = price[i];
            }
        }

        int result = max - min;
        if (result <= 0) {
            System.out.print(0);
        } else {
            System.out.print(result);
        }
    }
}