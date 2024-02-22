import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num = in.nextInt();

            if (num == 1) {
                System.out.println("John");
                    continue;
            } else if (num == 2) {
                System.out.println("Tom");
                    continue;
            } else if (num == 3) {
                System.out.println("Paul");
                    continue;
            } else if (num == 4) {
                System.out.println("Sam");
                    continue;
            } else {
                System.out.println("Vacancy");
                    break;
            }
        }
    }
}