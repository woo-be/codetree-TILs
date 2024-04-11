import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = in.nextInt();
        }

        int profit = 0;
        for (int i = 0; i < n; i++) {
            int profit_temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (profit_temp < price[j] - price[i]) {
                    profit_temp = price[j] - price[i];
                }
            }
            if (profit < profit_temp) {
                profit = profit_temp;
            }
        }

        System.out.print(profit);
    }
}