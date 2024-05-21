import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[10];
        for (int i = 0; i < 10; i++) {
            strs[i] = in.next();
        }
        char c = in.next().charAt(0);
        int cnt = 0;
        for (String str : strs) {
            if (str.charAt(str.length() - 1) == c) {
                System.out.println(str);
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.print("None");
        }
    }
}