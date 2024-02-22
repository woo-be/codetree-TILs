import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (true) {
            int num = in.nextInt();
            if (num % 2 == 1) {
                continue;
            } else {
                System.out.println(num / 2);
                count++;
            }
            if (count == 3) {
                break;
            }
        }
    }
}