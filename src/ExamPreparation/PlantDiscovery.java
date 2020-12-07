package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlantDiscovery {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String wordRegex = "(?<plant>[A-z]+)(?:<->)(?<rarityIndex>\\d+)";
        String commandAndPlantRegex = "(?<commandAndPlant>[A-z]+)";
        Pattern wordPattern = Pattern.compile (wordRegex);
        Pattern commandAndPlantPattern = Pattern.compile (commandAndPlantRegex);

        Map<String, Integer> plantMap = new HashMap<> ();

        int n = Integer.parseInt (scanner.nextLine ());
        String input;
        while (n-- > 0) {
            input = scanner.nextLine ();
            Matcher wordMatcher = wordPattern.matcher (input);
            if (wordMatcher.find ()) {
                String plant = wordMatcher.group ("plant");
                int rarityIndex = Integer.parseInt (wordMatcher.group ("rarityIndex"));
                if (!plantMap.containsKey (plant)) {
                    plantMap.put (plant, rarityIndex);
                } else {
                    plantMap.replace (plant, plantMap.get (plant), rarityIndex);
                }
            }
        }

        while (!"Exhibition".equals (input = scanner.nextLine ())) {
            Matcher commandAndPlantMatcher = commandAndPlantPattern.matcher (input);
            if (commandAndPlantMatcher.find ()) {
                String command = commandAndPlantMatcher.group (1);
                String plant = commandAndPlantMatcher.group (2);
            }
        }
        System.out.println ();
    }
}
