import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.StringBuilder;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    String[] strs = br.readLine().split(" ");
    String str1 = strs[0];
    String str2 = strs[1];
    int sum = extraction(str1, sb1) + extraction(str2, sb2);
    bw.write(String.valueOf(sum));

    bw.flush();
    br.close();
    bw.close();
  }

  private static int extraction(String str, StringBuilder sb) {
    for (char c : str.toCharArray()) {
        if (c >= '0' && c <= '9') {
            sb.append(c);
        } else {
            break;
        }
    }
    return Integer.valueOf(sb.toString());
  }
}