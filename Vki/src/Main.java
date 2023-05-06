import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double  b = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz :");
        double  k = scanner.nextDouble();

        double  result = k / (b * b);
        System.out.print("Vücut Kitle İndeksiniz :" + result);
    }
}