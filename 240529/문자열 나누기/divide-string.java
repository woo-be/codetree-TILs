import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strs = new String[n];
        String str = "";
        for (int i = 0; i < n; i++) {
            strs[i] = in.next();
            str += strs[i];
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}