import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Array size : ");

        int size = input.nextInt();

        int[] list = new int[size];

        System.out.println("Enter " + size + " numbers : ");

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + " : ");
            list[i] = input.nextInt();
        }

        double harmonic = 0;
        for (int j : list) {
            harmonic += 1.0 / j;
        }
        harmonic = list.length / harmonic;

        System.out.println("Result : " + harmonic);
    }
}