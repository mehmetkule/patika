package utils;


import java.util.Scanner;

public class ConsoleUtils {
    private static Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextInt();
    }

    public static double getDoubleInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }

    public static String getStringInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}