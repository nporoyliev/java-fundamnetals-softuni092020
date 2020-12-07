package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WorldTour {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        StringBuilder stops = new StringBuilder (scanner.nextLine ());

        String input;
        while (!"Travel".equals (input = scanner.nextLine ())) {
            String[] tokens = input.split (":");
            String command = tokens[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt (tokens[1]);
                    String insertString = tokens[2];
                    if (index >= 0 && index <= stops.length ()) {
                        stops.insert (index, insertString);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt (tokens[1]);
                    int endIndex = Integer.parseInt (tokens[2]);
                    if (startIndex >= 0 && endIndex < stops.length ()) {
                        stops.replace (startIndex, endIndex + 1, "");
                    }
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];

                    stops = new StringBuilder (stops.toString ().replace (oldString, newString));
                    break;
            }
            System.out.println (stops);

        }
        System.out.printf ("Ready for world tour! Planned stops: %s", stops);

    }
}
