import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int[] remainArr = new int[10];
        int sum = 0;
        
        while (true) {
            remainArr[a % b]++;
            a /= b;
            if (a <= 1) {
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            sum = sum + remainArr[i] * remainArr[i];
        }
        
        System.out.print(sum);
    }
}