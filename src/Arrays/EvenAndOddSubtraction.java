package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class EvenAndOddSubtraction {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[] numbers = Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .mapToInt (Integer::parseInt)
                .toArray ();

        Map<String, IntPredicate> evenOrOdd = new HashMap<> ();

        evenOrOdd.put ("even", number -> number % 2 == 0);
        evenOrOdd.put ("odd", number -> number % 2 != 0);

        int evenSum = calculateSum (numbers, evenOrOdd, "even");
        int oddSum = calculateSum (numbers, evenOrOdd, "odd");

        System.out.println (evenSum - oddSum);

    }

    private static int calculateSum (int[] numbers, Map<String, IntPredicate> evenOrOdd, String predicateName) {
        return Arrays.stream (numbers)
                .filter (evenOrOdd.get (predicateName))
                .sum ();
    }
}
