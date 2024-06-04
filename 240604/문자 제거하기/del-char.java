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
    int len = str.length();
    for (int i = 0; i < len - 1; i++) {
        int index = Integer.valueOf(br.readLine());
        if (index >= str.length()) {
            index = str.length() - 1;
        }
        str = str.substring(0, index) + str.substring(index + 1);
        bw.write(str + "\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}