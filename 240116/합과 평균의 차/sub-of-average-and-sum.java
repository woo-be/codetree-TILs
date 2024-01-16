import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println(a + b + c);
        System.out.printf("%d\n", (a + b + c) / 3);
        System.out.printf("%d",  (a + b + c) - ((a + b + c) / 3));
    }
}