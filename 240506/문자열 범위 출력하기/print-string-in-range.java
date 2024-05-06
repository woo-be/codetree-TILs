import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for (int i = 2; i < 10; i++) {
            System.out.print(str.charAt(i));
        }
    }
}