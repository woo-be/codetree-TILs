import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] countArr = new int[10];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            countArr[arr[i]]++;
        }

        for (int i = 1; i <= 9; i++) {
            System.out.println(countArr[i]);
        }
        
    }
}