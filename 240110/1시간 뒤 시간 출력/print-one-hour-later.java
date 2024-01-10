import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        in.useDelimiter(":");
        int h = in.nextInt();
        int m = in.nextInt();
        System.out.printf("%d:%d", h + 1, m);
    }
}