import java.util.Scanner;
/*
* details:https://academy.patika.dev/courses/java101/odev-vucut-kitle-hesaplama
*
*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height : ");
        double  height = scanner.nextDouble();

        System.out.print("Please enter your weight : ");
        double  weight = scanner.nextDouble();

        double  result = weight / (height * height);
        System.out.print("result : " + result);
    }
}