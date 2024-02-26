import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int init = 1;
        int x = 0;
        while (true) {
            if (init == n) {
                break;
            }
            init = init * 2;
            x++;
        }
        System.out.print(x);
    }
}