package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class SumEvenNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntPredicate isEvenNumber = number -> number % 2 == 0;

        System.out.println (Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .mapToInt (Integer::parseInt)
                .filter (isEvenNumber)
                .sum ());
    }
}

