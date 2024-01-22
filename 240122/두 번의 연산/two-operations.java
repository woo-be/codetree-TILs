import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 1) {
            a += 3;
            if (a % 3 == 0) {
                System.out.println(a / 3);
            } 
        } else {
            System.out.println(a);
        }
        
    }
}