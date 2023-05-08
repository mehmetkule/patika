import java.util.Scanner;

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