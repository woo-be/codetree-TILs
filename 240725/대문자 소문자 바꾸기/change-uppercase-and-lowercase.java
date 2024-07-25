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
        if (c >= 'a' && c <= 'z') {
            c = (char) ((int) 'A' + (c - 'a'));
        } else if (c >= 'A' && c <= 'Z') {
            c = (char) ((int) 'a' + (c - 'A'));
        }
        bw.write(c);
    }

    bw.flush();
    br.close();
    bw.close();
  }
}