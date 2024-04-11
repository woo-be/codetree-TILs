import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        int min = 1000;
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] < 500 && arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] > 500 && arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.print(max + " " + min);
    } 
}