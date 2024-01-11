import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("-");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.printf("0%d-%d-%d", a, c, b);
    }
}