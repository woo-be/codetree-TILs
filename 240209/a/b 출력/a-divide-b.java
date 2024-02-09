import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int rest = a % b;
        int temp = 0;
        System.out.print(a / b + ".");
        for (int i = 0; i < 20; i++) {
            temp = rest * 10;
            System.out.print(temp / b);
            rest = temp % b;
        }
    }
}