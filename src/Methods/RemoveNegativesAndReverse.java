package Methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            List<Integer> result = numbers.stream()
                    .filter(num -> num >= 0)
                    .collect(Collectors.toList());
            if (result.isEmpty()) {
                System.out.println("empty");
            } else {
                for (Integer integer : result) {
                    System.out.print(integer + " ");
                }
            }

        }
    }
}
