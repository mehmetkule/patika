import java.util.Scanner;
/*
* A leap year (also known as an intercalary year or bissextile year)
* is a calendar year that contains an additional day (or, in the case of a lunisolar calendar,
* a month) added to keep the calendar year synchronized with the astronomical year or seasonal year.
* detail :https://en.wikipedia.org/wiki/Leap_year
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " a leap year");
                } else {
                    System.out.println(year + " not a leap year");
                }
            } else {
                System.out.println(year + "  a leap year");
            }
        } else {
            System.out.println(year + "  not a leap year");
        }
    }
}