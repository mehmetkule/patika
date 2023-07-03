import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Prime numbers checker
        if (isPrime(number, number / 2)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }

    // Prime numbers function (recursive)
    public static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        } else {
            if (number % divisor == 0) {
                return false;
            } else {
                return isPrime(number, divisor - 1);
            }
        }
    }
}