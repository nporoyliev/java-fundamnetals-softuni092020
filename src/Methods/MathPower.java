package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        double power = scanner.nextDouble ();

        pow(number, power);
    }

    private static void pow (double number, double power) {
        System.out.println (new DecimalFormat ("0.####").format (Math.pow (number,power)));
    }
}
