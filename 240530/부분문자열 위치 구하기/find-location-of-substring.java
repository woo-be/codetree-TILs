import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        String tarStr = in.next();
        int inStrLength = inStr.length();
        int tarStrLength = tarStr.length();
        int startIdx = -1;
        for (int i = 0; i < inStrLength - tarStrLength + 1; i++) {
            if (inStr.substring(i, i + tarStrLength).equals(tarStr)) {
                startIdx = i;
                break;
            }
        }
        System.out.print(startIdx);
    }
}