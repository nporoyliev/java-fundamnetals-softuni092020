package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        char first = scanner.nextLine ().charAt (0);
        char second = scanner.nextLine ().charAt (0);

        printChars (first, second);
    }

    private static void printChars (char first, char second) {
        for (int i = Math.min(first,second) + 1; i < Math.max(first,second); ++i) {
            System.out.print ((char) i + " ");
        }
    }
}

