import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input % 2 == 1 && input % 3 == 0) {
                sum += input;
            }
        }
        System.out.print(sum);
    }
}