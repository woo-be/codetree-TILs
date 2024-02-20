import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int prob = 1;
        int num = 0;
        for (int i = 1; i <= 10; i++) {
            prob = prob * i;
            if (prob >= n) {
                num = i;
                break;
            }
        }
        System.out.print(num);
    }
}