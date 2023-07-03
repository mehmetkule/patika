import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
* Chinese Zodiac Sign Java Program | In this section, we will find the Chinese zodiac sign in Java.
* Chinese Zodiac Sign is a traditional classification usually based on the lunar calendar assigned to an animal.
* https://www.chinahighlights.com/travelguide/chinese-zodiac/
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year : ");
        int birthYear = sc.nextInt();

        List<String> signList = Arrays.asList("Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun");

        int result = birthYear % 12;
        System.out.println(result);
        System.out.println("Your chinese zodiac sign : " + signList.get(result));
    }
}