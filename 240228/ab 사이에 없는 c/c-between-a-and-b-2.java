import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String result = "YES";
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                result = "NO";
                break;
            }
        }
        System.out.print(result);
    }
}