import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 2; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = b; j >= a; j--) {
                    System.out.printf("%d * %d = %d", j, i, j * i);
                    if (j != 2) {
                        System.out.print(" / ");
                    }
                }
                System.out.println();
            }
        }
    }
}