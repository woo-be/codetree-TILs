import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int division = 1;
        while (true) {
            n = n / division;
            count++;
            division++;
            if (n <= 1) {
                break;
            }
        }
        System.out.print(count);
    }
}