package FinalExamFundamentals;

import java.util.Scanner;

public class Problem01 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        String string = scanner.nextLine ();

        String input;

        while (!"Finish".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split ("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Replace":
                    char oldChar = tokens[1].charAt (0);
                    char newChar = tokens[2].charAt (0);
                    string = string.replace (oldChar, newChar);
                    System.out.println (string);
                    break;

                case "Cut":
                    int startIndex = Integer.parseInt (tokens[1]);
                    int endIndex = Integer.parseInt (tokens[2]);
                    if (startIndex < 0 || endIndex >= string.length ()) {
                        System.out.println ("Invalid indices!");
                    } else {
                        string = string.replace (string.substring (startIndex, endIndex + 1), "");
                        System.out.println (string);
                    }
                    break;
                case "Make":
                    if (tokens[1].equals ("Upper")) {
                        string = string.toUpperCase ();
                    } else {
                        string = string.toLowerCase ();
                    }
                    System.out.println (string);
                    break;
                case "Check":
                    if (string.contains (tokens[1])) {
                        System.out.println ("Message contains " + tokens[1]);
                    } else {
                        System.out.println ("Message doesn't contain " + tokens[1]);
                    }
                    break;
                case "Sum":
                    int start = Integer.parseInt (tokens[1]);
                    int end = Integer.parseInt (tokens[2]);
                    int sum = 0;
                    if (start < 0 || end >= string.length ()) {
                        System.out.println ("Invalid indices!");
                    } else {
                        for (int i = start; i <= end; i++) {
                            sum += string.charAt (i);
                        }
                        System.out.println (sum);
                        break;
                    }
            }


        }
    }
}
