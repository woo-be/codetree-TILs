import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        } 
    }
}

// a=4, b=5
// i\j 1 2 3 4 5 
//  1  1 2 3 4 5
//  2  2 4 6 8 10
//  3  3 6 9 12 15
//  4  4 8 12 16 20
//  
//  
//
//
//