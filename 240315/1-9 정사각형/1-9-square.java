import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(cnt);
                cnt = pp(cnt);
            }
            System.out.println();
        }
    }

    static int pp(int i) {
        int temp = i + 1;
        if (temp == 10) {
            temp = 1;
        }
        return temp;
    }
}