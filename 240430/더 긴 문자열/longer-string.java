import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        if (str1.length() > str2.length()) {
            System.out.print(str1 + " " + str1.length());
        } else if (str1.length() == str2.length()) {
            System.out.print("same");
        } else {
            System.out.print(str2 + " " + str2.length());
        }
    }
}