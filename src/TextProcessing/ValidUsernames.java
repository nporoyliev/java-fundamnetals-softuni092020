package TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ValidUsernames {

    private static final Pattern pattern = Pattern.compile ("[\\w\\-_]*");

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<String> usernames = Arrays.stream (scanner.nextLine ().split (", ")).collect (Collectors.toList ());

        usernames.stream ()
                .filter (user -> {
                    boolean valid = user.length () >= 3 && user.length () <= 16;
                    if (valid) {

                        Matcher matcher = pattern.matcher (user);
                        return matcher.matches ();
                    }
                    return valid;
                })
                .forEach (System.out::println);
    }
}
