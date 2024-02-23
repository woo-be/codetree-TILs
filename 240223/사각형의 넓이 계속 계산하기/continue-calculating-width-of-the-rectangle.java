import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();
            String c = in.next();
            System.out.println(a * b);
            if (c.equals("C")) {
                break;
            }
        }

    }
}