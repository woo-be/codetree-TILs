import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int middle = in.nextInt();
        int last = in.nextInt();
        if (middle >= 90) {
            if (last >= 95) {
                System.out.println(100000);
            } else if (last >= 90) {
                System.out.println(5000);
            } else {
                System.out.println(0);
            }
        }
    }
}