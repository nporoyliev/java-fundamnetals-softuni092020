package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        String[] line = scan.nextLine ().split (" ");
        int res = sumOfChars (line[0], line[1]);
        System.out.println (res);
    }

    private static int sumOfChars (String s, String s1) {
        int res = 0;
        int minLength = Math.min (s.length (), s1.length ());
        for (int i = 0; i < minLength; i++) {
            res += s.charAt (i) * s1.charAt (i);
        }
        if (s.length () > s1.length ()) {
            for (int i = minLength; i < s.length (); i++) {
                res += s.charAt (i);
            }
        } else {
            for (int i = minLength; i < s1.length (); i++) {
                res += s1.charAt (i);
            }
        }
        return res;
    }
}


