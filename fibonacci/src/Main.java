import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        List<Integer> fibonacci = new ArrayList<>();
        for (int i = 0; i <= number; i++) {
            fibonacci.add(fibonacci(i));
        }
        System.out.println(fibonacci);
    }

    public static int fibonacci(int number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}