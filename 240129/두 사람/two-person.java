import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aAge = in.nextInt();
        String aSex = in.next();
        int bAge = in.nextInt();
        String bSex = in.next();

        if ((aAge >= 19 && aSex.equals("M")) || (bAge >= 19 && bSex.equals("M"))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}