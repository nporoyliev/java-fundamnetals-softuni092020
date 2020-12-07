package AssociativeArrays;

import java.util.*;

public class Ranking {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map<String, String> contests = new HashMap<> ();

        String input;
        while (!"end of contests".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split (":");
            String contest = tokens[0];
            String password = tokens[1];

            contests.put (contest, password);
        }

        Map<String, LinkedHashMap<String, Integer>> users = new HashMap<> ();

        while (!"end of submissions".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split ("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String userName = tokens[2];
            int points = Integer.parseInt (tokens[3]);

            if (contests.containsKey (contest)) {
                if (contests.get (contest).equals (password)) {

                    LinkedHashMap<String, Integer> course = new LinkedHashMap<> ();
                    course.put (contest, points);

                    if (!users.containsKey (userName)) {
                        users.put (userName, course);
                    } else {
                        if (!users.get (userName).containsKey (contest)) {
                            users.get (userName).put (contest, points);
                        } else {
                            users.get (userName).put (contest, Math.max (users.get (userName).get (contest), points));
                        }
                    }
                }
            }
        }

        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet ()) {
            int sum = user.getValue ().values ().stream ().mapToInt (Integer::intValue).sum ();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : users.entrySet ()) {
            if (totalSum == user.getValue ().values ().stream ().mapToInt (Integer::intValue).sum ()) {
                System.out.printf ("Best candidate is %s with total %d points.", user.getKey (), totalSum);
            }
        }
        System.out.println ("Ranking:");


        users.forEach ((key, value) -> {
            System.out.println (key);
            value.entrySet ()
                    .stream ()
                    .sorted ((f, s) -> f.getKey ().compareTo (s.getKey ()))
                    .forEach (user -> System.out.printf ("#  %s -> %d%n", user.getKey (), user.getValue ()));
        });
    }
}
