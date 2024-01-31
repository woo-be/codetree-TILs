import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aFlu = in.next();
        int aTemp = in.nextInt();
        String bFlu = in.next();
        int bTemp = in.nextInt();
        String cFlu = in.next();
        int cTemp = in.nextInt();
        int count = 0;
        if (aFlu.equals("Y") && aTemp >= 37 ) {
            count++;
        }
        if (bFlu.equals("Y") && bTemp >= 37 ) {
            count++;
        }
        if (cFlu.equals("Y") && cTemp >= 37 ) {
            count++;
        }
        if (count >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}