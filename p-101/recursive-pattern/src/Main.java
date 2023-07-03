import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Recursive Pattern
        recursivePattern(n);
    }

    // Recursive Pattern
    public static int recursivePattern(int n) {
        System.out.print(" " + n);
        int recursive = 0;
        if (n > 0) {
            recursive = recursivePattern(n - 5);
            System.out.print(" " + n);
        }

        return recursive;
    }

}