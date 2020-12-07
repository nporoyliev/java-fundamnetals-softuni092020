package TextProcessing;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String letterRegex = "[A-z]";
        String distRegex = "\\d";

        Pattern letterPattern = Pattern.compile (letterRegex);
        Pattern distPattern = Pattern.compile (distRegex);

        Map<String, Integer> racers = new HashMap<> ();
        String[] names = scanner.nextLine ().split (", ");
        for (String name : names) {
            racers.put (name, 0);
        }

        String input = scanner.nextLine ();

        while (!input.equals ("end of race")) {

            Matcher letterMatcher = letterPattern.matcher (input);
            StringBuilder name = new StringBuilder ();

            while (letterMatcher.find ()) {
                name.append (letterMatcher.group ());
            }

            if (racers.containsKey (name.toString ())) {
                int currentDist = racers.get (name.toString ());
                Matcher distMatcher = distPattern.matcher (input);
                while (distMatcher.find ()) {
                    currentDist += Integer.parseInt (distMatcher.group ());
                }
                racers.put (name.toString (), currentDist);
            }

            input = scanner.nextLine ();
        }

        List<String> winners = racers.entrySet ()
                .stream ()
                .sorted ((a, b) -> b.getValue () - a.getValue ())
                .limit (3)
                .map (Map.Entry::getKey)
                .collect (Collectors.toList ());

        int count = 1;
        for (String winner : winners) {
            switch (count++){
                case 1:
                    System.out.println ("1st place: " + winner);
                    break;
                case 2:
                    System.out.println ("2nd place: " + winner);
                    break;
                case 3:
                    System.out.println ("3rd place: " + winner);
                    break;
            }
        }
    }
}
