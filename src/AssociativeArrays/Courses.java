package AssociativeArrays;

import java.util.*;

public class Courses {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map<String, List<String>> coursesInfo = new LinkedHashMap<> ();

        String input = "";


        while (!"end".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split (" : ");

            String courseName = tokens[0];
            String studentName = tokens[1];

            if (!coursesInfo.containsKey (courseName)) {
                coursesInfo.put (courseName, new ArrayList<> ());
            }
            coursesInfo.get (courseName).add (studentName);
        }

        coursesInfo.entrySet ()
                .stream ()
                .sorted ((f, s) ->
                        s.getValue ().size () - f.getValue ().size ())
                .forEach (e -> {
                    System.out.println (e.getKey () + ": " + e.getValue ().size ());
                    e.getValue ()
                            .stream ()
                            .sorted ((f, s) -> f.compareTo (s))
                            .forEach (s -> System.out.println ("-- " + s));
                });
    }
}


