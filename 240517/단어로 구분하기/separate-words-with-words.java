import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[10];
        for (int i = 0; i < 10; i++) {
            strs[i] = in.next();
        }
        for(String str : strs) {
            System.out.println(str);
        }
    }
}