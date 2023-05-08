import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int i, j;
        System.out.print("Enter number of rows:");
        rows = sc.nextInt();

        for (i = rows; i >= 1; i--) {

            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}