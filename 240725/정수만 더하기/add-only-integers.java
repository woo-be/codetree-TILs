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
    int sum = 0;

    for (char c : str.toCharArray()) {
        if (c >= '0' && c <= '9') {
            int temp = Integer.valueOf(c - '0');
            sum = sum + temp;
        }
    }

    bw.write(String.valueOf(sum));

    bw.flush();
    br.close();
    bw.close();
  }
}