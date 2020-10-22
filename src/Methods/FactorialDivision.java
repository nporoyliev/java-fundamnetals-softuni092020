package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int first = scanner.nextInt ();
        int second = scanner.nextInt ();

        int ff = factorial (first);
        int sf = factorial (second);

        System.out.printf ("%.2f", (double) ff / sf);
    }

    private static int factorial (int number) {
        int result = 1;
        if (number == 1) {
            return 1;
        }
        for (int i = 1; i <= number; i++) {
            result *= i;

        }
        return result;
    }
}
