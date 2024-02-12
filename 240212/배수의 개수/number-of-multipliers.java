import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cntThree = 0;
        int cntFive = 0;
        for (int i = 0; i < 10; i++) {
            int input = in.nextInt();
            if (input % 3 == 0) {
                cntThree++;
            }
            if (input % 5 == 0) {
                cntFive++;
            }
        }
        System.out.print(cntThree + " " + cntFive);
    }
}