import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int[] countArr = new int[7];

        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 1; i < 7; i++) {
            System.out.printf("%d - %d\n", i, countArr[i]);
        }
    }
}