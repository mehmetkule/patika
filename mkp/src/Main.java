import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pear, apple, tomatoes, banana, aubergine, result;

        System.out.print("Armut Kaç Kilo ? : ");
        pear = sc.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        apple = sc.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        tomatoes = sc.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        banana = sc.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        aubergine = sc.nextDouble();

        result = totalCost(pear, apple, tomatoes, banana, aubergine);
        System.out.println("Toplam Tutar : " + result + " TL");

    }

    public static double totalCost(double pear, double apple, double tomatoes, double banana, double aubergine) {
        double pearCost = 2.14;
        double appleCost = 3.67;
        double tomatoesCost = 1.11;
        double bananaCost = 0.95;
        double aubergineCost = 5.00;
        double total = (pear * pearCost) + (apple * appleCost) + (tomatoes * tomatoesCost) + (banana * bananaCost) + (aubergine * aubergineCost);
        return total;
    }
}
