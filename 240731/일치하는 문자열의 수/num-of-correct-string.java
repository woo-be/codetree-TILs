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
    String a = strs[1];
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        String str = br.readLine();
        if (a.equals(str)) {
            cnt++;
        }
    }
    bw.write(String.valueOf(cnt));

    bw.flush();
    br.close();
    bw.close();
  }
}