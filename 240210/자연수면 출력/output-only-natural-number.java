import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

    if (a > 0) {
        for (int i = 0; i < b; i++) {
            System.out.print(a);
        }
    } else if (a <= 0) {
        System.out.print("0");
    }
}
}