package ListOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class AnonymousThreat {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        String[] strings = scanner.nextLine ( ).split ( "\\s+" );
        ArrayList<String> list = new ArrayList<>();

        String input = scanner.nextLine ( );
        while (!input.equals ( "3:1" )) {


            String[] tokens = input.split ( "\\s+" );

            switch (tokens[0]) {
                case "merge":
                    int startIndex = Integer.parseInt ( tokens[1] );
                    int endIndex = Integer.parseInt ( tokens[2] );



                    break;
                case "divide":


            }
        }
    }
}
