import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        while (a <= b) {
            System.out.print(a + " ");
            a += 2;
        }
    }
}