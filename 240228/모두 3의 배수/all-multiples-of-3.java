import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 1;

        for (int i = 0; i < 5; i++) {
            if (in.nextInt() % 3 != 0) {
                result = 0;
                break;
            }
        }
        System.out.print(result);

    }
}