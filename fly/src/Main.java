import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double distance, kmTotal;
        int age, type;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        distance = scanner.nextDouble();
        if (distance < 0) {
            System.out.print("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.print("Yaşınızı giriniz :");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = scanner.nextInt();

        kmTotal = distance * 0.10;

        if (age < 12) {
            kmTotal = kmTotal * 0.5;
        } else if (age <= 24) {
            kmTotal = kmTotal * 0.9;
        } else if (age >= 65) {
            kmTotal = kmTotal * 0.7;
        }

        if (type == 2) {
            kmTotal = kmTotal * 0.8;
            kmTotal = kmTotal * 2;
        }

        System.out.print("Toplam Tutar : " + kmTotal);
    }
}