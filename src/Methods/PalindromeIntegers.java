package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine ();
        while(!input.equalsIgnoreCase ("end")) {
            System.out.println (palindromeCheck (input) ? "true" : "false");
            input = scanner.nextLine();
        }
    }

    private static boolean palindromeCheck (String input) {
        String leftPart = "";
        String rightPart = "";

        int length = input.length ();

        if (length == 1){
            return true;
        }

        if (length % 2 != 0) {
            leftPart = input.substring (0, length / 2);
            String temp = input.substring (((length / 2) + 1), length);
            for (int i = temp.length () - 1; i >= 0; --i) {
                rightPart += temp.charAt (i);
            }
        } else {
            leftPart = input.substring (0,length/2);
            String temp = input.substring ((length/2 + 1), length);
            for (int i = temp.length () - 1; i >= 0; --i) {
                rightPart += temp.charAt (i);
            }
        }
        return leftPart.equals (rightPart);
    }
}
