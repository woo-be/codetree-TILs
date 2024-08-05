import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] strs = br.readLine().split(" ");
    Double h = Double.valueOf(strs[0]);
    Double w = Double.valueOf(strs[1]);
    int b = (int) ((10000 * w) / (h * h));
    System.out.printf("%d\n", b);
    if (b >= 25) {
        System.out.print("Obesity");
    }

    bw.flush();
    br.close();
    bw.close();
  }
}