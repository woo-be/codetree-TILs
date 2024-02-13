import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int classCnt = 0;
        int corridorCnt = 0;
        int restCnt = 0;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 12 == 0) {
                restCnt++;
            } else if (i % 3 == 0) {
                corridorCnt++;
            } else if (i % 2 == 0) {
                classCnt++;
            }
        }
        System.out.print(classCnt + " " + corridorCnt + " "  + restCnt);
    }
}