import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        char a = input[0].charAt(0);
        int b = Integer.parseInt(input[1]);
        bw.write((int) a + " " + (char) b);
        bw.flush();
    }
}