import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = new char[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = in.next().charAt(0);
        }
        
        System.out.printf("%c %c %c", arr[1], arr[4], arr[7]);
    }
}