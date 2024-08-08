import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.valueOf(br.readLine());
    int[][] arr = new int[n][n];
    int cnt = 1;
    while(cnt != (n * n + 1)) {
        for (int i = n - 1; i >= 0; i--) {
            // System.out.println("i: " + i);
            if (n % 2 == 0) {
                if (i % 2 == 0) {
                    for (int j = 0; j < n; j++) {
                        // System.out.println("j: " + j);
                        // System.out.println(cnt);
                        arr[j][i] = cnt++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        // System.out.println("j: " + j);
                        // System.out.println(cnt);
                        arr[j][i] = cnt++;
                    }
                }
            } else {
                if (i % 2 == 1) {
                    for (int j = 0; j < n; j++) {
                        // System.out.println(cnt);
                        arr[j][i] = cnt++;
                    }
                } else {
                    for (int j = n - 1; j >= 0; j--) {
                        // System.out.println(cnt);
                        arr[j][i] = cnt++;
                    }
                }
            }
        }
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            bw.write(arr[i][j] + " ");
        }
        bw.write("\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}