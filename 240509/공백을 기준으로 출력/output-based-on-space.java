import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String[] strs1 = str1.split(" ");
        String[] strs2 = str2.split(" ");
        for (int i = 0; i < strs1.length; i++) {
            System.out.print(strs1[i]);
        }
        for (int i = 0; i < strs2.length; i++) {
            System.out.print(strs2[i]);
        }
    }
    
}