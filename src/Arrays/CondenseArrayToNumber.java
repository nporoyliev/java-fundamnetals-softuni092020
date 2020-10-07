package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int[] array = createIntArray (scanner);


        int condenseResult = condenseArray (array);
        System.out.println (condenseResult);


    }

    private static int condenseArray (int[] array) {
        int[] resultArray = new int[array.length];
        int n = array.length -1;
        while (n-- > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                resultArray[i] = array[i] + array[i + 1];
            }
            array = resultArray;
        }

        return array[0];
    }

    private static int[] createIntArray (Scanner scanner) {
        return Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .mapToInt (Integer::parseInt)
                .toArray ();
    }
}
