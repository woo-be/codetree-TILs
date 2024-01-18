import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        System.out.println(score == 100 ? "pass" : "failure");
    }
}