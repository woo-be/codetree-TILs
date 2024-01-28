import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        if (m >= 3 && m <=5) {
            System.out.println("Spring");
        } else if (m <= 8) {
            System.out.println("Summer");
        } else if (m <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}