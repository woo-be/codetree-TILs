import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                result = 1;
                break;
            }
        }
        System.out.print(result);
    }
}