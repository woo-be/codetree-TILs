import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = br.readLine().split(" ");
    char a = arr[0].charAt(0);
    char b = arr[1].charAt(0);
    int sum = (int)a + (int)b;
    int diff = (int)a > (int)b ? (int)a - (int)b : (int)b - (int)a;
    bw.write(sum + " " + diff);

    bw.flush();
    br.close();
    bw.close();
  }
}