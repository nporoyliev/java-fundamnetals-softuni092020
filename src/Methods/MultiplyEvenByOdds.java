package Methods;

import java.util.Scanner;

public class MultiplyEvenByOdds {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[] numbers = scanner.nextLine ()
                .chars ()
                .filter (Character::isDigit)
                .map (Character::getNumericValue)
                .toArray ();

        int evenSum = 0;
        int oddSum =0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenSum+= numbers[i];
            } else {
                oddSum += numbers[i];
            }
        }

        System.out.println (evenSum * oddSum);

        System.out.println ();


      //  multiply (scanner);
    }

    private static void multiply (Scanner scanner) {
        int evenSum = 0;
        int oddSum = 0;

        int currentNumber = Integer.parseInt (scanner.nextLine ());
        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;
            if (currentDigit % 2 == 0) {
                evenSum += currentDigit;
            } else {
                oddSum += currentDigit;
            }
            currentNumber /= 10;
        }

        System.out.println (evenSum * oddSum);
    }
}
