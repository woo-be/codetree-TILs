import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max1 = in.nextInt();
        int max2 = in.nextInt();
        for (int i = 0; i < n - 2; i++) {
            int temp = in.nextInt();
            if (temp > max1) {
                max2 = max1;
                max1 = temp;
            } else if (temp > max2) {
                max2 = temp;
            }
            if (max2 > max1) {
                int t = max2;
                max2 = max1;
                max1 = t;
            }
        }
        System.out.print(max1 + " " + max2);
    }
}