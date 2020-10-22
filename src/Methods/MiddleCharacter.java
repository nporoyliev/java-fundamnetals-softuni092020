package Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();

        printMiddleCharacter (input);
    }

    private static void printMiddleCharacter (String input) {
        int length = input.length ();
        if (length % 2 == 0) {
            System.out.print (input.charAt ((length / 2) -1));
            System.out.println (input.charAt (length/2));
        } else {
            System.out.println (input.charAt (length / 2));
        }
    }
}
