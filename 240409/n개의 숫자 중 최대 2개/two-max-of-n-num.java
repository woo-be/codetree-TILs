import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long max1 = in.nextLong();
        long max2 = max1;
        for (int i = 0 ; i < n - 1; i++) {
            long temp = in.nextLong();
            if (temp > max1) {
                max2 = max1;
                max1 = temp;
            } else if (temp > max2) {
                max2 = temp;
            }
        }

        System.out.print(max1 + " " + max2);
    }
}