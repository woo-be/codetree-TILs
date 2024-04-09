import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long min = in.nextLong();
        int cnt = 1;
        for (int i = 0; i < n - 1; i++) {
            long temp = in.nextLong();
            if (min == temp) {
                cnt++;
            }
            if (min > temp) {
                min = temp;
                cnt = 1;
            }
        }
        System.out.print(min + " " + cnt);
    }
}