import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <=b; ) {
            System.out.print(i + " ");
            if (i % 2 == 1) {
                i *= 2;
            } else {
                i += 3;
            }
        }
    }
}