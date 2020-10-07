package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Train {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int wagonsCount = Integer.parseInt (scanner.nextLine ());

        int sum = 0;

        for (int number = 0; number < wagonsCount; number++) {
            int people = scanner.nextInt ();
            sum += people;
            System.out.print (people + " ");
        }
        System.out.println ();
        System.out.println (sum);
    }
}
