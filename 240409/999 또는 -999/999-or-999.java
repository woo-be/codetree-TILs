import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max = min;
        for (int i = 0; i < 99; i++) {
            int temp = in.nextInt();
            if (temp == 999 || temp == -999) {
                break;
            }
            if (min > temp) {
                min = temp;
            }
            if (max < temp) {
                max = temp;
            }
        }
        System.out.print(max + " " + min);
    }
}