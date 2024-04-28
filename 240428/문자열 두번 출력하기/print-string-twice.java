import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
    }
}