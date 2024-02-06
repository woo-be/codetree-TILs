import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while ((3*i) <= n) {
            System.out.print(3 * i + " ");
            i++;
        }
    }
}