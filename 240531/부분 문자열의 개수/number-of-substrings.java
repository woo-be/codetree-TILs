import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int aLength = a.length();
        int bLength = b.length();
        int cnt = 0;
        for (int i = 0; i < aLength - bLength + 1; i++) {
             if (a.substring(i, i + bLength).equals(b)) {
                cnt++;
             }
        }
        System.out.print(cnt);
    }
}