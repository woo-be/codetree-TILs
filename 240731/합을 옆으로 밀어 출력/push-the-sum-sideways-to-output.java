import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.valueOf(br.readLine());
    int sum = 0;
    for (int i = 0; i < n; i++) {
        int in = Integer.valueOf(br.readLine());
        sum += in;
    }

    char[] arr = Integer.toString(sum).toCharArray();
    char temp = arr[0];
    for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i+1];
    }
    arr[arr.length - 1] = temp;
    bw.write(arr);

    bw.flush();
    br.close();
    bw.close();
  }
}