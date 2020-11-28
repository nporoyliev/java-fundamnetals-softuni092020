package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String line = scanner.nextLine ();
        StringBuilder result = new StringBuilder ();
        int sequenceLength = 0;

        for (int i = 0; i < line.length (); i++) {

            char currentChar = line.charAt (i);

            if (currentChar == '>') {
                result.append (currentChar);
                i++;
                sequenceLength = Integer.parseInt (String.valueOf (line.charAt (i)));
            }

            while (sequenceLength > 0) {
                sequenceLength--;
                i++;
                currentChar = line.charAt (i);
                if (currentChar == '>') {
                    result.append (currentChar);
                    i++;
                    sequenceLength += Integer.parseInt (String.valueOf (line.charAt (i)));
                }
            }

            result.append (currentChar);
        }

        System.out.println (result.toString ());
    }
}

