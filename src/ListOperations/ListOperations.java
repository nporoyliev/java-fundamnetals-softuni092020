package ListOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        List<Integer> numbers = Arrays.stream ( scanner.nextLine ( ).split ( "\\s+" ) )
                .map ( Integer::parseInt )
                .collect ( Collectors.toList ( ) );

        String input = scanner.nextLine ( );

        while (!input.equalsIgnoreCase ( "end" )) {
            String[] tokens = input.split ( "\\s+" );
            switch (tokens[0]) {
                case "Add":
                    numbers.add ( Integer.parseInt ( tokens[1] ) );
                    break;
                case "Remove":
                    numbers.remove ( Integer.parseInt ( tokens[1] ) );
                    break;
                case "Shift":
                    if ( tokens[1].equals ( "left" ) ) {
                        for (int i = 0; i < Integer.parseInt ( tokens[2] ); i++) {
                            numbers.add ( numbers.get ( 0 ) );
                            numbers.remove ( 0 );
                        }
                    } else {
                        for (int i = 0; i < Integer.parseInt ( tokens[2] ); i++) {
                            numbers.add ( 0, numbers.get ( numbers.size ( ) - 1 ) );
                            numbers.remove ( numbers.remove ( numbers.size ( ) - 1 ) );
                        }
                    }
                    break;
            }


            input = scanner.nextLine ( );
        }
        printList ( numbers );
    }

    private static void printList ( List<Integer> numbers ) {
        for (Integer number : numbers) {
            System.out.print ( number + " " );
        }
    }
}

