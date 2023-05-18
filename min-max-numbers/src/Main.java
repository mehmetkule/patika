import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        int number, min = 0, max = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();
        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (list[i] < number) {
                min = list[i];
            }
        }
        System.out.println("Min: " + min);
        for (int i = list.length-1; i >= 0; i--) {
            if (list[i] > number) {
                max = list[i];
            }
        }
        System.out.println("Max: " + max);
    }
}