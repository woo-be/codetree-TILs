import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num == 1) {
            System.out.println("John");
        } else if ( num == 2) {
            System.out.println("Tom");
        } else if (num == 3) {
            System.out.println("Paul");
        } else {
            System.out.println("Vacancy");
        }
    }
}