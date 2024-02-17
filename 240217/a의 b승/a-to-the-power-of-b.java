import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int prob = 1;

        if (b == 0) {
            System.out.print(1);
        } else {

        for (int i = 1; i <= b; i++) {
            prob *= a;
        }

        System.out.print(prob);
        }
    }
}