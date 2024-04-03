import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] clinicCount = new int[4];
        for (int i = 0; i < 3; i++) {
            char symptom = in.next().charAt(0);
            int temperature = in.nextInt();
            if (symptom == 'Y' && temperature >= 37) {
                clinicCount[0]++;
            }
            if (symptom == 'N' && temperature >= 37) {
                clinicCount[1]++;
            }
            if (symptom == 'Y' && temperature < 37) {
                clinicCount[2]++;
            }
            if (symptom == 'N' && temperature < 37) {
                clinicCount[3]++;
            }
        }
            for (int i : clinicCount) {
                System.out.print(i + " ");
            }
            if (clinicCount[0] >= 2) {
                System.out.print("E");
            }
        
    }
}