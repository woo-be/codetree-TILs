import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        char[] aToCharArr = a.toCharArray();
        char[] bToCharArr = b.toCharArray();
        bToCharArr[0] = aToCharArr[0];
        bToCharArr[1] = aToCharArr[1];
        for (char c : bToCharArr) {
            System.out.print(c);
        }
    }
}