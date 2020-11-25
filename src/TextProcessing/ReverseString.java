package TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String line = "";

        while (!"end".equals (line = scanner.nextLine ())) {
            StringBuilder sb = new StringBuilder ();
            for (int i = line.length () -1; i >= 0; --i) {
                sb.append (line.charAt (i));
            }
            System.out.println (line + " = " + sb);
        }
    }
}
