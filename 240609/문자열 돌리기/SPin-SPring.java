import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();
    bw.write(str);
    bw.newLine();
    int len = str.length();
    for (int i = 0; i < len; i++) {
        str = str.substring(len - 1, len) + str.substring(0, len - 1);
        bw.write(str);
        bw.newLine();
    }
    bw.flush();
    br.close();
    bw.close();
  }
}