package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        List<String> items = Arrays.stream (scanner.nextLine ().split (", ")).collect (Collectors.toList ());

        String input = scanner.nextLine ();
        while (!input.equals ("Craft!")) {
            String[] command = input.split (" - ");
            switch (command[0]) {
                case "Collect":
                    if (!items.contains (command[1])) {
                        items.add (command[1]);
                    }
                    break;
                case "Drop":
                    items.remove (command[1]);
                    break;
                case "Combine Items":
                    String[] item = command[1].split (":");
                    if (items.contains (item[0])) {
                        int index = items.indexOf (item[0]);
                        items.add (index + 1, item[1]);
                    }
                    break;
                case "Renew":
                    if (items.contains (command[1])) {
                        String currentItem = command[1];
                        items.remove (currentItem);
                        items.add (currentItem);
                    }
                    break;
            }
                input = scanner.nextLine ();
        }
        System.out.println (String.join (",", items.toString ()).replaceAll ("[\\[\\]]", ""));
    }
}
