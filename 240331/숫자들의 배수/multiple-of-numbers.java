import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int time = 1;
        int cnt = 0;
        while (cnt != 2) {
            int temp = input * time;
            System.out.print(temp + " ");
            time++;
            if (temp % 5 == 0) {
                cnt++;
            }
        }
    }
}