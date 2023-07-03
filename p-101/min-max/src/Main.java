import java.util.Scanner;

/*
*Finding the minimum and maximum values of the entered values
* details:https://academy.patika.dev/courses/java101/odev-min-max
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? : ");
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.printf(i+1 + ". Enter number: ");
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}