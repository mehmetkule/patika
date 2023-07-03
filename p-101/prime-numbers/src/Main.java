/*
* Prime numbers are numbers greater than 1. They only have two factors, 1 and the number itself.
* This means these numbers cannot be divided by any number other than 1 and the number itself without leaving a remainder.
* details: https://www.splashlearn.com/math-vocabulary/algebra/prime-number
* */
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.print(" " + i + " ");
        }
    }
}

