package AssociativeArrays;

import java.util.*;

public class StudentAcademy {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());

        Map<String, List<Double>> students = new LinkedHashMap<> ();

        while (n-- > 0) {
            String name = scanner.nextLine ();
            double grade = Double.parseDouble (scanner.nextLine ());

            if (!students.containsKey (name)) {
                students.put (name, new ArrayList<> ());
            }
            students.get (name).add (grade);
        }
        students.entrySet ()
                .stream ()
                .filter (s -> {
                    double average = s.getValue ().stream ()
                            .mapToDouble (Double::doubleValue)
                            .average ()
                            .getAsDouble ();
                    return average >= 4.5;
                })
                .sorted ((f, s) -> {
                    double firstAverage = f.getValue ().stream ()
                            .mapToDouble (Double::doubleValue)
                            .average ()
                            .getAsDouble ();

                    double secondAverage = s.getValue ().stream ()
                            .mapToDouble (Double::doubleValue)
                            .average ()
                            .getAsDouble ();

                    return Double.compare (secondAverage, firstAverage);
                }).forEach (s ->
                System.out.printf ("%s -> %.2f%n", s.getKey (), s.getValue ().stream ()
                        .mapToDouble (Double::doubleValue)
                        .average ()
                        .getAsDouble ()));
    }
}
