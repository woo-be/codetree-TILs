import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        String ab = a + b;
        String ba = b + a;
        if (ab.equals(ba)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}