import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5== 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}