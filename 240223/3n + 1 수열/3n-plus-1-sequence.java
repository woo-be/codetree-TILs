import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        while (true) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
            if (n == 1) {
                break;
            }
        }
        System.out.print(count);
    }
}