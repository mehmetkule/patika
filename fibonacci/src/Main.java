import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* In mathematics, the Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.
* Numbers that are part of the Fibonacci sequence are known as Fibonacci numbers, commonly denoted Fn .
* The sequence commonly starts from 0 and 1, although some authors start the sequence from 1 and 1 or sometimes (as did Fibonacci)
* from 1 and 2. Starting from 0 and 1, the first few values in the sequence are:[1]0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
* detail: https://en.wikipedia.org/wiki/Fibonacci_sequence
* */
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