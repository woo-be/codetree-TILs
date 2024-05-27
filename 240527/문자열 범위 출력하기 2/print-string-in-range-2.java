import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int a = in.nextInt();
        if (a > str.length()) {
            a = str.length();
        }
        for (int i = str.length() - 1; i >= (str.length() - a); i--) {
            System.out.print(str.charAt(i));
        }
    }
}