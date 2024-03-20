import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " * " + j + " = " + i * j);
                if (j == n - i + 1) {
                    System.out.println();
                } else {
                    System.out.print(" / ");
                }
            }
        }
    }
}