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
    for (int i = 0; i < strs.length; i++) {
        bw.write((char) Integer.parseInt(strs[i]) + " ");
    }
    

    bw.flush();
    br.close();
    bw.close();
  }
}