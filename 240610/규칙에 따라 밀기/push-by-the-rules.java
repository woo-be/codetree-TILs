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
    String query = br.readLine();
    int len = a.length();
    for (int i = 0; i < query.length(); i++) {
        if (query.charAt(i) == 'L') {
            a = a.substring(1) + a.substring(0, 1);
        } else if (query.charAt(i) == 'R') {
            a = a.substring(len - 1, len) + a.substring(0, len - 1);
        }
    }
    bw.write(a);

    bw.flush();
    br.close();
    bw.close();
  }
}