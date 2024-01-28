import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aMath = in.nextInt();
        int aEngilsh = in.nextInt();
        int bMath = in.nextInt();
        int bEnglish = in.nextInt();
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