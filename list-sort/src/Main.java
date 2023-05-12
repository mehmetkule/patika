import java.util.Scanner;

import static java.util.Arrays.sort;

// Sort list
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create list
        int[] list = new int[n];
        System.out.println("Enter the elements: ");

        // Input list
        for (int i = 0; i < n; i++) {
            System.out.print(i +1 + ". Element: ");

            list[i] = scanner.nextInt();
        }
        // Sort list
        sort(list);
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
}