package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] names = scanner.nextLine ().split ("\\s+");

        calculateSumOfChars (names[0], names[1]);
        System.out.println ();
    }

    private static void calculateSumOfChars (String name, String name1) {
        int totalSum = 0;


        int min = Math.min (name.length (), name1.length ());
        for (int i = 0; i < min; i++) {
            totalSum = name.charAt (i) * name1.charAt (i);
        }
        if (name.length () > name1.length ()){
            for (int i = min; i < name.length (); i++) {
               totalSum +=  name.charAt (i);
            }
            System.out.println ();
        }
    }
}
