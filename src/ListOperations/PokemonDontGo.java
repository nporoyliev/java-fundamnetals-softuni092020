package ListOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        int totalSum = 0;

        int removedIndexValue = 0;

        List<Integer> pokemons = Arrays.stream ( scanner.nextLine ( ).split ( "\\s+" ) )
                .map ( Integer::parseInt )
                .collect ( Collectors.toList ( ) );

        while (pokemons.size ( ) > 0) {

            int index = Integer.parseInt ( scanner.nextLine ( ) );

            if ( index < 0 ) {
                removedIndexValue = pokemons.get ( 0 );
                totalSum += removedIndexValue;
                pokemons.remove ( 0 );
                pokemons.add ( 0, pokemons.get ( pokemons.size ( ) - 1 ) );
            } else if ( index > pokemons.size ( ) - 1 ) {
                removedIndexValue = pokemons.get ( pokemons.size ( ) - 1 );
                totalSum += removedIndexValue;
                pokemons.remove ( pokemons.size ( ) - 1 );
                pokemons.add ( pokemons.get ( 0 ) );
            } else {
                removedIndexValue = pokemons.get ( index );
                totalSum += removedIndexValue;
                pokemons.remove ( index );
            }

            for (int i = 0; i < pokemons.size ( ); i++) {
                if ( pokemons.get ( i ) <= removedIndexValue ) {
                    pokemons.set ( i, pokemons.get ( i ) + removedIndexValue );
                } else {
                    pokemons.set ( i, pokemons.get ( i ) - removedIndexValue );
                }
            }
        }
        System.out.println ( totalSum );
    }

}
