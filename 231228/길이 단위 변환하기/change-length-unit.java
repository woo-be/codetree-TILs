public class Main {
    public static void main(String[] args) {
        double ft = 9.2;
        double mi = 1.3;
        double ftTocm = ft * 30.48;
        double miTocm = mi * 160934;
        System.out.printf("%.1fft = %.1fcm\n", ft, ftTocm);
        System.out.printf("%.1fmi = %.1fcm", mi, miTocm);
    }
}