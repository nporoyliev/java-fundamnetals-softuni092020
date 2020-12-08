package ExamPreparation;

import java.util.Scanner;

public class PasswordReset {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String rawPassword = scanner.nextLine ();

        String input;
        while (!"Done".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split ("\\s+");
            String command = tokens[0];
            switch (command) {
                case "TakeOdd":
                    String tempPassword = "";
                    for (int i = 1; i < rawPassword.length (); i += 2) {
                        tempPassword += rawPassword.charAt (i);
                    }
                    rawPassword = tempPassword;
                    System.out.println (rawPassword);
                    break;
                case "Cut":
                    int index = Integer.parseInt (tokens[1]);
                    int length = Integer.parseInt (tokens[2]);

                    rawPassword = rawPassword.replace (rawPassword.substring (index, index + length), "");
                    System.out.println (rawPassword);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];

                    if (rawPassword.contains (substring)) {
                        rawPassword = rawPassword.replace (substring, substitute);
                        System.out.println (rawPassword);
                    } else {
                        System.out.println ("Nothing to replace!");
                    }
                    break;
            }
        }
        System.out.println ("Your password is: " + rawPassword);
    }
}
