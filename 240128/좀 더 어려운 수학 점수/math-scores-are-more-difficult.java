import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aMath = in.netxInt();
        int aEngilsh = in.netxInt();
        int bMath = in.netxInt();
        int bEnglish = in.netxInt();
        if (aMath > bMath) {
            System.out.println("A");
        } else if (aMath < bMath) {
            System.out.println("B");
        } else {
            if (aEngilsh > bEnglish) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
    }
}