import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] strAndQuery = br.readLine().split(" ");
    String str = strAndQuery[0];
    int q = Integer.valueOf(strAndQuery[1]);
    int len = str.length();
    for (int i = 0; i < q; i++) {
        int query = Integer.valueOf(br.readLine());
        if (query == 1) {
            str = str.substring(1) + str.substring(0, 1);
        } else if (query == 2) {
            str = str.substring(len - 1, len) + str.substring(0, len - 1);
        } else if (query == 3) {
            char[] arr = str.toCharArray();
            for (int j = 0; j < len / 2; j++) {
                char temp = arr[j];
                arr[j] = arr[len - 1 - j];
                arr[len - 1 - j] = temp;
            }
            str = String.valueOf(arr);
        }
        bw.write(str + "\n");
    }
    bw.flush();
    br.close();
    bw.close();
  }
}