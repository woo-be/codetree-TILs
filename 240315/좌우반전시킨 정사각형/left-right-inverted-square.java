import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}