import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "P";
        for (int i = 2; i <= (n-1); i++) {
            if (n % i == 0) {
                str = "C";
                break;
            }
        }
        System.out.print(str);
    }
}