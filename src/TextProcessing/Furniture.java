package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        String furniturePattern = "\\>\\>(?<name>\\w+)\\<\\<(?<price>\\d+[.\\d]*)\\!(?<quantity>\\d+)\\b";

        Pattern pattern = Pattern.compile ( furniturePattern );

        String input;


        List<String> furnitureList = new ArrayList<> ( );
        furnitureList.add ( "Bought furniture" );

        double totalAmount = 0.0;

        while (!"Purchase".equals ( input = scanner.nextLine ( ) )) {
            Matcher matcher = pattern.matcher ( input );
            while (matcher.find ( )) {
                furnitureList.add ( matcher.group ( "name" ) );
                double price = Double.parseDouble ( matcher.group ( "price" ) );
                int quantity = Integer.parseInt ( matcher.group ( "quantity" ) );

                totalAmount += price * quantity;


            }
        }

        for (String s : furnitureList) {
            System.out.println ( s );
        }
        System.out.println ( totalAmount );

    }
}
