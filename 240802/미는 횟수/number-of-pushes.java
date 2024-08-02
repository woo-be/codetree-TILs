import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String A = br.readLine();
    String B = br.readLine();
    int cnt = 0;
    int length = A.length();
    for (int i = 0; i < length; i++) {
        A = shiftRight(A);
        cnt++;
        if (A.equals(B))  {
            bw.write(String.valueOf(cnt));
            bw.write("\n");
            break;
        }
    }
    if (cnt == length) {
        bw.write("-1");
        bw.write("\n");
    }

    bw.flush();
    br.close();
    bw.close();
  }

  private static String shiftRight(String str) {
    int length = str.length();
    char last = str.charAt(length - 1);
    char[] arr = str.toCharArray();
    for (int i = 0; i < length - 1; i++) {
        arr[length - 1 - i] = arr[length - 2 - i];
    }
    arr[0] = last;
    return String.valueOf(arr);
  }
}