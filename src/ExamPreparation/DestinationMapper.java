package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();

        int stopSum = 0;

        String regex = "([\\/=])(?<currentStop>[A-Z][A-z]{2,})\\1";
        Pattern stopPatter = Pattern.compile (regex);
        Matcher stopMatcher = stopPatter.matcher (input);

        List<String> stopList = new ArrayList<> ();

        while (stopMatcher.find ()) {
            String currentStop = stopMatcher.group ("currentStop");
            stopList.add (currentStop);
            stopSum += currentStop.length ();
        }

        System.out.printf ("Destinations: %s%n", String.join (", ", stopList));
        System.out.printf ("Travel Points: %d", stopSum);
    }
}
