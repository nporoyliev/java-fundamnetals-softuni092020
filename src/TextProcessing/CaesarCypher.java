package TextProcessing;

import java.util.Scanner;

public class CaesarCypher {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        scanner.nextLine ().chars ()
                .forEach (c -> System.out.print ((char)(c +3)));



    }
}
