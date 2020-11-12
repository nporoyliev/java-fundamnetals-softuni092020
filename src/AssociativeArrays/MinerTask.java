package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        var input = "";
        while (!"stop".equals(input = scanner.nextLine())) {
            int amount = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(input)) {
                resources.put(input, resources.get(input) + amount);
            } else {
                resources.put(input, amount);
            }
        }
        printMap(resources);
    }

    private static void printMap(Map<String, Integer> resources) {
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
