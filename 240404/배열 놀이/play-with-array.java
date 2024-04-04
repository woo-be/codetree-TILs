import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) { // 배열 초기화
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < q; i++) { // 질의문 실행
            int q1 = in.nextInt();
            int q2 = in.nextInt();
            if (q1 == 1) {
                // System.out.print("q1 = " + q1 + ", q2 = " + q2 + " ");
                System.out.println(arr[q2 - 1]);
            } else if (q1 == 2) {
                int index = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == q2) {
                        index = j + 1;
                        break;
                    }
                }
                System.out.println(index);
            } else if (q1 == 3) {
                int q3 = in.nextInt();
                for (int j = q2 -1; j <= q3 - 1; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}