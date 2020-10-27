package ListOperations;

import java.util.Arrays;
import java.util.Scanner;

public class AppendArrays {
    public static void main ( String[] args ) {

        Scanner scanner = new Scanner ( System.in );

        String[] split = scanner.nextLine ( ).split ( "\\|" );
        String temp = "";
        for (int i = split.length - 1; i >= 0; --i) {
            temp += split[i] + " ";
        }
        String result = temp.replaceAll ( "\\s+", "" );

        for (int i = 0; i < result.length (); i++) {
            System.out.print (result.charAt ( i ) + " " );
        }
        System.out.println ( );
    }
}
