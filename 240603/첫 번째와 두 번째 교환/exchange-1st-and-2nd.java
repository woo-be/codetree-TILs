import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] arr = str.toCharArray();
        char first = arr[0];
        char second = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                arr[i] = second;
            } else if (arr[i] == second) {
                arr[i] = first;
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);
    }
}