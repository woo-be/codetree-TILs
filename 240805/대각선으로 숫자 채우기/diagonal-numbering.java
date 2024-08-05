import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] strs = br.readLine().split(" ");
    int n = Integer.valueOf(strs[0]);
    int m = Integer.valueOf(strs[1]);
    int[][] arr = new int[n][m];
    int cnt = 1;
    int line = 0;
    while (cnt != (n * m) + 1) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) == line) {
                    arr[i][j] = cnt++;
                }
            }
        }
        line++;
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            bw.write(arr[i][j] + " ");
        }
        bw.write("\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}