package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map<String, String> parking = new HashMap<> ();

        int n = Integer.parseInt (scanner.nextLine ());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine ();
            String[] tokens = input.split ("\\s+");

            String command = tokens[0];
            String username = tokens[1];
            String licensePlate = "";


            switch (command) {
                case "register":
                    licensePlate = tokens[2];
                    if (parking.containsKey (username)) {
                        System.out.printf ("ERROR: already registered with plate number %s%n", parking.get (username));
                    } else {
                        parking.put (username, licensePlate);
                        System.out.printf ("%s registered %s successfully%n", username, licensePlate);
                    }
                    break;
                case "unregister":
                    if (!parking.containsKey (username)) {
                        System.out.printf ("ERROR: user %s not found%n", username);
                    } else {
                        parking.remove (username);
                        System.out.printf ("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        printMap (parking);
    }

    private static void printMap (Map<String, String> parking) {
        parking.entrySet ().stream ()
                .forEach (user -> System.out.printf ("%s => %s%n", user.getKey (), user.getValue ()));
    }
}
