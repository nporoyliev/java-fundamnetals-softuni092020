package TextProcessing;

import java.util.Scanner;

public class DigitsLettersNOthers {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();

        System.out.println (input.replaceAll ("[^\\d]*", ""));
        System.out.println (input.replaceAll ("[^a-zA-Z]*", ""));
        System.out.println (input.replaceAll ("[\\w\\d]*", ""));



    }
}
