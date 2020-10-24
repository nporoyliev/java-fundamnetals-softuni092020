package Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LIstManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Contains":
                    if (numbers.contains(Integer.parseInt(tokens[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (tokens[1]) {
                        case "even":
                            numbers.stream()
                                    .filter(number -> number % 2 == 0)
                                    .forEach(num -> System.out.print(num + " "));
                            System.out.println();
                            break;
                        case "odd":
                            numbers.stream()
                                    .filter(num -> num % 2 != 0)
                                    .forEach(num -> System.out.print(num + " "));
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    Integer sum = numbers.stream()
                            .reduce(0, Integer::sum);
                    System.out.println(sum);
                    break;
                case "Filter":
                    filterNumbers(tokens[1], tokens[2], numbers);
                    break;
            }
            input = scanner.nextLine();
        }
    }


    private static void filterNumbers(String condition, String number, List<Integer> numbers) {
        int num = Integer.parseInt(number);
        switch (condition) {
            case "<":
                numbers.stream()
                        .filter(e -> e < num)
                        .forEach(n -> System.out.print(n + " "));
                System.out.println();
                break;
            case "<=":
                numbers.stream()
                        .filter(e -> e <= num)
                        .forEach(n -> System.out.print(n + " "));
                System.out.println();
                break;
            case ">":
                numbers.stream()
                        .filter(e -> e > num)
                        .forEach(n -> System.out.print(n + " "));
                System.out.println();
                break;
            case ">=":
                numbers.stream()
                        .filter(e -> e >= num)
                        .forEach(n -> System.out.print(n + " "));
                System.out.println();
        }
    }

}

