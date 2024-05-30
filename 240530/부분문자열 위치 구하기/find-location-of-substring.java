import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inStr = in.next();
        String tarStr = in.next();
        // int inStrLength = inStr.length();
        // int tarStrLength = tarStr.length();
        // int startIdx = -1;
        System.out.print(inStr.indexOf(tarStr));
    }
}