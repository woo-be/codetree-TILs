import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int init = 1;

        for (int i = a; i <= b; i++) {
            init *= i;
        }

        System.out.print(init);
    }
}