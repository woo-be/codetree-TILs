import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String a = br.readLine();
    String b = br.readLine();
    int bLength = b.length();
    boolean isExist = true;

    while (isExist) {
        int cnt = 0;
        for (int i = 0; i < a.length() - bLength + 1; i++) {
            if (a.substring(i, i + bLength).equals(b)) {
                a = a.substring(0, i) + a.substring(i + bLength);
                cnt++;
            }
        }
        if (cnt == 0) {
            isExist = false;
        }
    }
    bw.write(a);
    bw.flush();
    br.close();
    bw.close();
  }
}