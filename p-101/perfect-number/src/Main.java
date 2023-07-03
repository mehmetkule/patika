import java.util.Scanner;

/*
* In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
* For instance, 6 has divisors 1, 2 and 3 (excluding itself), and 1 + 2 + 3 = 6, so 6 is a perfect number.
* details: https://en.wikipedia.org/wiki/Perfect_number
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid number");
        } else {
            if (isPerfectNumber(number)) {
                System.out.println(number + " Perfect number");
            } else {
                System.out.println(number + " Not a perfect number");
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