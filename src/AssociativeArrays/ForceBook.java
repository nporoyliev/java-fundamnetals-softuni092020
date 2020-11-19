package AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = "";

        Map<String, List<String>> forceMap = new HashMap<> ();

        while (!"Lumapawaroo".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split ("\\s+");

            String side = "";
            String command = tokens[1];
            String user = "";

            switch (command) {
                case "|":
                    side = tokens[0];
                    user = tokens[2];
                    if (!forceMap.containsKey (side)) {
                        forceMap.put (side, new ArrayList<> ());
                        forceMap.get (side).add (user);
                    } else if (forceMap.containsKey (side)) {
                        if (!forceMap.containsKey (user)) {
                            forceMap.get (side).add (user);
                        }
                    }
                    break;
                case "->":
                    side = tokens[2];
                    user = tokens[0];
                    if (forceMap.containsKey (user)){

                    }
                        break;
            }


        }
    }
}
