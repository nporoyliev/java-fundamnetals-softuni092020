package AssociativeArrays;

import java.util.*;
import java.util.function.Consumer;

public class OddOccurrences {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().toLowerCase().split("\\s+");

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        Arrays.stream(words)
                .forEach(word -> {
                    word.toLowerCase();
                    if (!wordsMap.containsKey(word)) {
                        wordsMap.put(word, 1);
                    } else {
                        wordsMap.put(word, wordsMap.get(word) + 1);
                    }
                });

        Consumer<Map<String,Integer>> mapConsumer = word -> {
            for (Map.Entry<String, Integer> entry : word.entrySet()) {
                if (entry.getValue() % 2 != 0){
                    System.out.print(entry.getKey() + " ");
                }
            }
        };

        mapConsumer.accept(wordsMap);
    }
}
