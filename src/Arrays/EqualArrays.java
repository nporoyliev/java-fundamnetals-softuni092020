package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] intArray1 = createIntArray (scanner);
        int[] intArray2 = createIntArray (scanner);

        boolean areIdentical = true;

        for (int i = 0; i < intArray1.length; i++) {
            if (intArray1[i] != intArray2[i]){
                System.out.printf ("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }
            if (areIdentical){
                System.out.printf ("Arrays are identical. Sum: %d", calculateSum (intArray1));
            }
    }

    private static int calculateSum (int[] intArray1) {
        return Arrays.stream (intArray1)
                .sum ();
    }

    private static int[] createIntArray (Scanner scanner) {
        return Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .mapToInt (Integer::parseInt)
                .toArray ();
    }
}
