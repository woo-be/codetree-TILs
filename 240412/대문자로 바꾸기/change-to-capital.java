import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] arr = new char[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.next().charAt(0);
                System.out.print( (char) (arr[i][j] - 32) + " ");
            }
            System.out.println();
        }
        
    }
}