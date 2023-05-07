import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, kmTutar;
        int yas, tip;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = scanner.nextDouble();
        if (mesafe < 0) {
            System.out.print("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.print("Yaşınızı giriniz :");
        yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = scanner.nextInt();

        kmTutar = mesafe * 0.10;

        if (yas < 12) {
            kmTutar = kmTutar * 0.5;
        } else if (yas <= 24) {
            kmTutar = kmTutar * 0.9;
        } else if (yas >= 65) {
            kmTutar = kmTutar * 0.7;
        }

        if (tip == 2) {
            kmTutar = kmTutar * 0.8;
            kmTutar = kmTutar * 2;
        }

        System.out.print("Toplam Tutar : " + kmTutar);
    }
}