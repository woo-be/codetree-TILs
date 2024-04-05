import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if (n2 > n1) {
            System.out.println("No");
        } else {
            int[] arr1 = new int[n1];
            int[] arr2 = new int[n2];
            for (int i = 0; i < n1; i++) { // 배열 초기화
                arr1[i] = in.nextInt();
            }
            for (int i = 0; i < n2; i++) { // 배열 초기화
                arr2[i] = in.nextInt();
            }
            
            boolean result = false;
            for(int i = 0; i <= n1 - n2; i++) {
                if (arr1[i] == arr2[0]) {
                    int temp = i;
                    int cnt = 0;
                    for (int j = 0; j < n2; j++, temp++) {
                        if (arr2[j] == arr1[temp]) {
                            cnt++;
                        }
                    }
                    if (cnt == n2) {
                        result = true;
                    }
                }
            }

            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}