import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] arr = s.toCharArray();
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int category = in.nextInt();
            if (category == 1) {
                int a = in.nextInt();
                int b = in.nextInt();
                char temp = arr[a-1];
                arr[a-1] = arr[b-1];
                arr[b-1] = temp;
                System.out.println(String.valueOf(arr));
            } else if (category == 2) {
                char a = in.next().charAt(0);
                char b = in.next().charAt(0);
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == a) {
                        arr[j] = b;
                    }
                }
                System.out.println(String.valueOf(arr));
            }
        }
    }
}