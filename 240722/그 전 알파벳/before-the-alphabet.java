import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    char input = br.readLine().charAt(0);
    if (input == 'a') {
        input = 'z';
    } else {
        input = (char) (input - 1);
    }
    bw.write(input);

    bw.flush();
    br.close();
    bw.close();
  }
}