package FinalExamFundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int count = Integer.parseInt (scanner.nextLine ());

        String passRegex = "(.*)>([\\d]{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<\\1";
        Pattern passPattern = Pattern.compile (passRegex);

        for (int i = 0; i < count; i++) {
            String password = scanner.nextLine ();
            Matcher passMatcher = passPattern.matcher (password);

            if (passMatcher.find ()) {
                System.out.print ("Password: ");
                System.out.println ((passMatcher.group (2)
                        + passMatcher.group (3)
                        + passMatcher.group (4)
                        + passMatcher.group (5)));
            } else {
                System.out.println ("Try another password!");
            }
        }
    }
}
