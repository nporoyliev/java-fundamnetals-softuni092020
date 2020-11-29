package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );

        String phoneNumber = "\\+359([\\s|\\-])2\\1\\d{3}\\1\\d{4}";

        String input = scanner.nextLine ( );

        List<String> phoneList = new ArrayList<>();

        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher ( input );

        while (matcher.find ()){
             phoneList.add ( matcher.group ( ) ) ;
        }

        System.out.println ( String.join ( ", ", phoneList ) );
    }
}
