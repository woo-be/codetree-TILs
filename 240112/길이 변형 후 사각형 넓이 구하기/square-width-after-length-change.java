import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int length = in.nextInt();
        width += 8;
        length *= 3;
        System.out.println(width);
        System.out.println(length);
        System.out.println(width * length);
    }
}