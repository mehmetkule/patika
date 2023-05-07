import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Bir sayı giriniz: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("Geçersiz sayı girdiniz.");
        } else {
            if (isPerfectNumber(number)) {
                System.out.println(number + " Mükemmel sayıdır");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        return sum == number;
    }
}