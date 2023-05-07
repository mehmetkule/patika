import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double armut, elma, domates, muz, patlican, result;

        System.out.print("Armut Kaç Kilo ? : ");
        armut = sc.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = sc.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = sc.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = sc.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = sc.nextDouble();

        result = totalCost(armut, elma, domates, muz, patlican);
        System.out.println("Toplam Tutar : " + result + " TL");

    }

    public static double totalCost(double armut, double elma, double domates, double muz, double patlican) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;
        double total = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
        return total;
    }
}
