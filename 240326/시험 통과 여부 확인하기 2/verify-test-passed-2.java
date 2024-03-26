import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int people = in.nextInt();
        int pass = 0;
        for (int i = 0; i < people; i++) {
            int[] score = new int[4];
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < 4; j++) {
                score[j] = in.nextInt();
                sum += score[j];
            }
            avg = (double) sum / 4;
            if (avg >= 60) {
                pass++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        System.out.print(pass);
        
    }
}