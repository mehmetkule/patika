import java.util.Scanner;

/*
* Calculating by taking the Distance (KM), age and trip type (One Way, Round-Round) information from the user
* detail :https://academy.patika.dev/courses/java101/odev-ucak-bileti
*/
public class Main {
    public static void main(String[] args) {
        double distance, kmTotal;
        int age, type;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers :");
        distance = scanner.nextDouble();
        if (distance < 0) {
            System.out.print("Invalid kilometers");
            return;
        }

        System.out.print("Enter age :");
        age = scanner.nextInt();

        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip):");
        type = scanner.nextInt();

        kmTotal = distance * 0.10;

        if (age < 12) {
            kmTotal = kmTotal * 0.5;
        } else if (age <= 24) {
            kmTotal = kmTotal * 0.9;
        } else if (age >= 65) {
            kmTotal = kmTotal * 0.7;
        }

        if (type == 2) {
            kmTotal = kmTotal * 0.8;
            kmTotal = kmTotal * 2;
        }

        System.out.print("Total : " + kmTotal);
    }
}