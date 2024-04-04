import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        char c = in.next().charAt(0);
        int index = -1;

        for (int i = 0; i < 6; i++) {
            if (arr[i] == c) {
                index = i;
            }
        }

        System.out.print(index >= 0 ? index : "None");
    }
}