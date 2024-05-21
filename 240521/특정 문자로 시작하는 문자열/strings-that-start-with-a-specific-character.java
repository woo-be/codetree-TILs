import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
        }
        char c = in.next().charAt(0);
        int cnt = 0;
        int sum = 0;
        for (String str : strs) {
            if (str.charAt(0) == c) {
                cnt ++;
                sum += str.length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double)sum / cnt);
    }
}