import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                result += str.charAt(i);
            }
        }
        System.out.print(result);
    }
}