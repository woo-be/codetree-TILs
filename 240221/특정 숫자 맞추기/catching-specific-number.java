import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int input = in.nextInt();
            if (input < 25) {
                System.out.println("Higher");
            } else if (input > 25) {
                System.out.println("Lower");
            } else if (input == 25) {
                System.out.println("Good");
                break;
            }
        }
    }
}