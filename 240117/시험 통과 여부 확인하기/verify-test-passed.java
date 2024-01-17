import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n >= 80) {
            System.out.println("pass");
        } else {
            System.out.print(80 - n);
            System.out.println(" more score");
        }
    }
}