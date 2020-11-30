package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LetterChangeNumbers {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<String> sequences = Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .collect (Collectors.toList ());




       // System.out.println ('s' - 'a' + 1);
    }

    public static double calculateStringSum (String sequence) {

        for (int i = 0; i < sequence.length (); i++) {

            char leadingChar = sequence.charAt (0);
            char lastChar = sequence.charAt (sequence.length () - 1);
            int number = 0;

            Pattern digitsPattern = Pattern.compile ("\\d*");
            Matcher matcher = digitsPattern.matcher (sequence);

            if (matcher.matches ()) {
                number = Integer.parseInt (matcher.group (1));
            }
            System.out.println ();


        }

        return 0.0;
    }
}
