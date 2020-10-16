package Methods;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int current = scanner.nextInt ();
            smallest = checkSmallest (current, smallest);
        }

        printSmallest(smallest);

    }

    private static void printSmallest (int smallest) {
        System.out.println (smallest);
    }

    private static int checkSmallest (int current, int smallest) {
        if (current < smallest) {
            smallest = current;
        }
        return smallest;
    }
}
