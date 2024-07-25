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
    int ab = Integer.parseInt(strs[0] + strs[1]);
    int ba = Integer.parseInt(strs[1] + strs[0]);
    bw.write(String.valueOf(ab + ba));

    bw.flush();
    br.close();
    bw.close();
  }
}