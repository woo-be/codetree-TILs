import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = new String[200];
    int cnt = 0;
    while(true) {
        String str = br.readLine();
        if (str.equals("0")) {
            break;
        }
        arr[cnt] = str;
        cnt++;
    }
    bw.write(String.valueOf(cnt));
    bw.write("\n");
    for (int i = 0; i < cnt; i++) {
        if (i % 2 == 0) {
            bw.write(arr[i]);
            bw.write("\n");
        }
    }

    bw.flush();
    br.close();
    bw.close();
  }
}