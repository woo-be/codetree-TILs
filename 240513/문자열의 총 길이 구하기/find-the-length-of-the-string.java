import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.next();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i].length();
        }
        System.out.print(sum);
    }
}