package AssociativeArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class WordSynonyms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        HashMap<String, ArrayList<String>> synonyms = new HashMap<>();

        for (int i = 0; i < counter; i++) {
            String word = scanner.nextLine();
            String syn = scanner.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(syn);
        }

        Consumer<HashMap<String,ArrayList<String>>> mapConsumer = map -> {
            for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
                System.out.printf("%s - %s%n", entry.getKey(),
                        entry.getValue().toString().replaceAll("[\\[\\]]", ""));
            }
        };
        mapConsumer.accept(synonyms);
    }
}
