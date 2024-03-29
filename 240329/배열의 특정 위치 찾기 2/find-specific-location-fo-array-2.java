import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            oddSum += arr[i];
        }

        for (int i = 1; i < 10; i += 2) {
            evenSum += arr[i];
        }
        
        if (oddSum >= evenSum) {
            System.out.print(oddSum - evenSum);
        } else {
            System.out.print(evenSum - oddSum);
        }
    }
}