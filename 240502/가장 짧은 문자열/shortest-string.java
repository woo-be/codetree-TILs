import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        int i1 = str1.length();
        String str2 = in.nextLine();
        int i2 = str2.length();
        String str3 = in.nextLine();
        int i3 = str3.length();
        int a1 = Math.abs(i1-i2);
        int a2 = Math.abs(i1-i3);
        int a3 = Math.abs(i3-i2);
        if (a1 > a2) {
            if (a1 > a3) {
                System.out.print(a1);
            } else {
                System.out.print(a3);
            }
        } else {
            if (a2 > a3) {
                System.out.print(a2);
            } else {
                System.out.print(a3);
            }
        }
    }
}