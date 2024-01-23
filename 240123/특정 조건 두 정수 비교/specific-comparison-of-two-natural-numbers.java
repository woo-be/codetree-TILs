import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            System.out.println("1 0");
        } else if (a == b) {
            System.out.println("0 1");   
        } else if (a > b) {
            System.out.println("0 0");
        }
    }
}