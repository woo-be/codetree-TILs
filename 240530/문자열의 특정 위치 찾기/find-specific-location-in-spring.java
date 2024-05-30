import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int index = -1;
        String str = in.next();
        char c = in.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.print("No");
        } else {
            System.out.print(index);
        }
    }
}