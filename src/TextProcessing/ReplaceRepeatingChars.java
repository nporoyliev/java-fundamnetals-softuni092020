package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder res = new StringBuilder();

         char ch = input.charAt(0);
         res.append (ch);

        for (int i = 0; i < input.length (); i++) {
            char symbol = input.charAt(i);
            if (ch != symbol){
                ch = symbol;
                res.append (ch);
        }
        }
        System.out.println (res.toString ());
    }
}
