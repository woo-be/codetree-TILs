import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double left = in.nextDouble();
        double right = in.nextDouble();
        if(left >= 1.0 && right >= 1.0) {
            System.out.println("High");
        } else if (left >= 0.5 && right >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}