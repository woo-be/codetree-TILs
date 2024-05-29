import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String ee = "No";
        String ab = "No";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                ee = "Yes";
            }
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                ab = "Yes";
            }
        }
        System.out.print(ee + " ");
        System.out.print(ab);
    }
}