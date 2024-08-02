import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while(true) {
      String str = br.readLine();
      if (str.equals("END")) {
        break;
      }
      for (int i = 0; i < str.length(); i++) {
        bw.write(str.charAt(str.length() - 1 - i));
      }
      bw.write("\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}