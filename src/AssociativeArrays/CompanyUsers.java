package AssociativeArrays;

import java.util.*;

public class CompanyUsers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map<String, List<String>> companyUsers = new HashMap<> ();

        String input = "";

        while (!"End".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split (" -> ");
            String name = tokens[0];
            String id = tokens[1];

            if (!companyUsers.containsKey (name)) {
                companyUsers.put (name, new ArrayList<> ());
                companyUsers.get (name).add (id);
            } else if (companyUsers.containsKey (name)) {
                if (!companyUsers.get (name).contains (id)) {
                    companyUsers.get (name).add (id);

                }
            }
        }


        companyUsers.entrySet ()
                .stream ()
                .sorted (Comparator.comparing (Map.Entry::getKey))
                .forEach (user -> {
                    System.out.println (user.getKey ());
                    user.getValue ().stream ()
                            .forEach (s -> System.out.println ("-- " + s));
                });
    }
}


