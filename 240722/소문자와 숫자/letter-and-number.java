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
    for (char c : str.toCharArray()) {
        if (c >= '0' && c <= '9') {
            bw.write(c);
        } else if (c >= 'a' && c <= 'z') {
            bw.write(c);
        } else if (c >= 'A' && c <= 'Z') {
            bw.write('a' + (c - 'A'));
        }
    }

    bw.flush();
    br.close();
    bw.close();
  }
}