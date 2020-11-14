package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main ( String[] args ) {


        Scanner scanner = new Scanner ( System.in );

        Map<String, Integer> items = new HashMap<> ( );
        Map<String, Integer> junk = new HashMap<> ( );


        initializeItemsMap ( items );

        boolean hasMagicItem = false;

        while (!hasMagicItem) {
            String[] input = scanner.nextLine ( ).split ( "\\s+" );

            for (int i = 0; i < input.length; i += 2) {

                int quantity = Integer.parseInt ( input[i] );
                String itemName = input[i + 1];

                if ( !items.containsKey ( itemName ) ) {
                    if ( !junk.containsKey ( itemName ) ) {
                        junk.put ( itemName, 0 );
                    } else {
                        junk.put ( itemName, junk.get ( itemName ) + quantity );
                    }
                } else {
                    items.put ( itemName, items.get ( itemName ) + quantity );
                    hasMagicItem = checkEnoughMaterial ( items, itemName );
                }
            }

        }
    }


    private static boolean checkEnoughMaterial ( Map<String, Integer> items, String itemName ) {

        if ( items.get ( itemName ) >= 250 ) {
            return true;
        }
        return false;
    }

    private static void initializeItemsMap ( Map<String, Integer> items ) {
        items.put ( "shards", 0 );
        items.put ( "fragments", 0 );
        items.put ( "motes", 0 );
    }
}
