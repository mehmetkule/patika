import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter a exp number: ");
        int exp = scanner.nextInt();

        int result = power(base, exp);
        System.out.println("Result: " + result);
    }
    // recursive method
    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        // recursive call to power()
        return (base * power(base, exp - 1));
    }
}