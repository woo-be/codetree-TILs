import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int input = in.nextInt();
            if (input % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}