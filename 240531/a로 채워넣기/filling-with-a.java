import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String result = str.substring(0, 1) + 'a' + str.substring(2, str.length() - 2) + 'a' + str.charAt(str.length() -1);
        System.out.print(result);
    }
}