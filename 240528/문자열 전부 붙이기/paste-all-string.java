import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        String result = "";
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
            result += strs[i];
        }
        System.out.print(result);
    }
}