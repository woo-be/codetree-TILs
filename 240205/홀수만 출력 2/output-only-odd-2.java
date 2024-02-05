import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int a = in.nextInt();
        for (int i = b; i >= a; i -= 2) {
            System.out.print(i + " ");
        }
    }
}