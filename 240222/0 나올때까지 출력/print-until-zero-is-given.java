import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            System.out.println(input);
        }
    }
}