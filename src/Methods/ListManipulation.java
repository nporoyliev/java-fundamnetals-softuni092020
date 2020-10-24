package Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Add":
                    int number = Integer.parseInt(tokens[1]);
                    numbers.add(number);
                    break;
                case "Remove":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "RemoveAt":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    numbers.remove(indexToRemove);
                    break;
                case "Insert":
                    int indexToInsertAt = Integer.parseInt(tokens[2]);
                    int numberToInsert = Integer.parseInt(tokens[1]);
                    if (numbers.size() > indexToInsertAt){
                    numbers.add(indexToInsertAt, numberToInsert);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
