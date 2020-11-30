package Regexes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RaceTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String letterRegex = "[A-Za-z]+";
        String distRegex = "\\d";

        Pattern letterPattern = Pattern.compile(letterRegex);
        Pattern distPattern = Pattern.compile(distRegex);

        Map<String, Integer> racers = new HashMap<>();
        String[] split = scanner.nextLine().split(". ");
        for (String s : split) {
            racers.put(s, 0);
        }


        String input;
        while(!"end of race".equals(input = scanner.nextLine())){

            StringBuilder name = new StringBuilder();

            Matcher letterMatcher = letterPattern.matcher(input);
            while(letterMatcher.find()){
                name.append(letterMatcher.group());
            }

            if (racers.containsKey(name.toString())){
                int currentDistance = racers.get(name.toString());
                Matcher distMatcher = distPattern.matcher(input);
                while (distMatcher.find()){
                    currentDistance += Integer.parseInt(distMatcher.group());
                }
                racers.put(name.toString(), racers.get(name.toString()) + currentDistance);
            }
        }
        int[] id = {1};
       racers.entrySet().stream()
               .sorted((a,b) -> b.getValue().compareTo(a.getValue()))
               .limit(3)
               .forEach(n -> {
                        switch(id[0]) {
                            case 1:
                                System.out.print("1st place: ");
                                break;
                            case 2:
                                System.out.print("2nd place: ");
                                break;
                            case 3:
                                System.out.print("3rd place: ");
                                break;
                        }
                        id[0] += 1;
                   System.out.println(n.getKey());
                        });

}
}
