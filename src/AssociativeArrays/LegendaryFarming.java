package AssociativeArrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        Map<String, Integer> items = new HashMap<> ();
        Map<String, Integer> junk = new HashMap<> ();

        String winner = "";


        initializeItemsMap (items);

        boolean hasMagicItem = false;

        while (!hasMagicItem) {
            String[] input = scanner.nextLine ().split ("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                int quantity = Integer.parseInt (input[i]);
                String itemName = input[i + 1].toLowerCase ();

                if (!items.containsKey (itemName)) {
                    if (!junk.containsKey (itemName)) {
                        junk.put (itemName, quantity);
                    } else {
                        junk.put (itemName, junk.get (itemName) + quantity);
                    }
                } else {
                    items.put (itemName, items.get (itemName) + quantity);
                    hasMagicItem = checkEnoughMaterial (items, itemName);
                    if (hasMagicItem) {
                        items.put (itemName, items.get (itemName) - 250);
                        winner = itemName;
                        break;
                    }
                }
            }
            switch (winner) {
                case "shards":
                    System.out.println ("Shadowmourne obtained!");
                    break;
                case "motes":
                    System.out.println ("Dragonwrath obtained!");
                    break;
                case "fragments":
                    System.out.println ("Valanyr obtained!");
                    break;
            }

        }


        items.entrySet ()
                .stream ()
                .sorted ((e1, e2) -> {
                    int sort = e2.getValue ().compareTo (e1.getValue ());
                    if (sort == 0) {
                        sort = e1.getKey ().compareTo (e2.getKey ());
                    }
                    return sort;
                })
                .forEach (e -> {
                    System.out.println (String.format ("%s: %d", e.getKey (), e.getValue ()));
                });

        junk.entrySet ().stream ().sorted(Comparator.comparing (Map.Entry::getKey))
                .forEach (e -> {
                    System.out.printf("%s: %d%n", e.getKey (), e.getValue ());
                });
    }




    private static boolean checkEnoughMaterial (Map<String, Integer> items, String itemName) {

        if (items.get (itemName) >= 250) {
            return true;
        }
        return false;
    }

    private static void initializeItemsMap (Map<String, Integer> items) {
        items.put ("shards", 0);
        items.put ("fragments", 0);
        items.put ("motes", 0);
    }
}
