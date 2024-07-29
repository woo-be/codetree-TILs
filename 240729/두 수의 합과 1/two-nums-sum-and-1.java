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
    int i1 = Integer.valueOf(strs[0]);
    int i2 = Integer.valueOf(strs[1]);
    int sum = i1 + i2;
    int cnt = 0;
    for (char c : Integer.toString(sum).toCharArray()) {
        if (c == '1') {
            cnt++;
        }
    }
    bw.write(Integer.toString(cnt));

    bw.flush();
    br.close();
    bw.close();
  }
}