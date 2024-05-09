import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        char str2 = in.next().charAt(0);
        int cnt = 0;
        for (int i = 0 ; i < str1.length(); i++) {
            if (str1.charAt(i) == str2) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}