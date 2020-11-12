package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Double,Integer> counts = new TreeMap<>();

         Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .forEach(number -> {
                    if (!counts.containsKey(number)){
                        counts.put(number,1);
                    } else {
                        counts.put(number,counts.get(number) + 1);
                    }
                });


        //printMap(counts);

        Consumer<TreeMap<Double, Integer>> mapPrinter = number -> {
            for (Map.Entry<Double, Integer> entry:
                number.entrySet() ) {
                DecimalFormat df = new DecimalFormat("#.#####");
                System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
            }
        };
        mapPrinter.accept(counts);
    }

    private static void printMap(TreeMap<Double, Integer> counts) {
        for (Map.Entry<Double, Integer> entry:
        counts.entrySet()){
            DecimalFormat df = new DecimalFormat("#.#####");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
