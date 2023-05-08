import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year");
        int birthYear = sc.nextInt();

        List<String> signList = Arrays.asList("Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun");

        int result = birthYear % 12;
        System.out.println("Your chinese zodiac sign : " + signList.get(result));
    }
}