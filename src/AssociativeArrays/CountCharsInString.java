package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountCharsInString {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        char[] chars = scanner.nextLine ().toCharArray ();

        Map<Character, Integer> characterMap = new HashMap<> ();

        int space = ' ';

        for (int i = 0; i < chars.length; i++) {


            char c = chars[i];
            if (c != space) {
                if (!characterMap.containsKey (c)) {
                    characterMap.put (c, 1);
                } else {
                    characterMap.put (c, characterMap.get (c) + 1);
                }
            }
        }

        printMap (characterMap);

    }

    private static void printMap (Map<Character, Integer> characterMap) {
        for (Map.Entry<Character, Integer> entry : characterMap.entrySet ()) {
            System.out.println (entry.getKey () + " -> " + entry.getValue ());
        }
    }
}
