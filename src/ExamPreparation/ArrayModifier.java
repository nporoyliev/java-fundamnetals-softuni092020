package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayModifier {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<Integer> numbers = Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .map (Integer::parseInt)
                .collect (Collectors.toList ());


        String input = scanner.nextLine ();
        while (!input.equals ("end")) {
            String[] commands = input.split ("\\s+");
            switch (commands[0]) {
                case "swap":
                    int firstIndex = Integer.parseInt (commands[1]);
                    int secondIndex = Integer.parseInt (commands[2]);

                    int tempNumber = numbers.get (firstIndex);

                    numbers.set (firstIndex, numbers.get (secondIndex));
                    numbers.set (secondIndex, tempNumber);
                    break;
                case "multiply":
                    int first = Integer.parseInt (commands[1]);
                    int second = Integer.parseInt (commands[2]);
                    numbers.set (first, numbers.get (first) * numbers.get (second));
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size (); i++) {
                        numbers.set (i, numbers.get (i) - 1);
                    }
                    break;
            }
                    input = scanner.nextLine ();
        }

        Function<Integer, String> toStringFunction = digit -> digit + "";

      Consumer<List<Integer>> consumer = num ->  System.out.println (num.stream ()
                .map (toStringFunction)
                .collect (Collectors.joining (", ")));

        consumer.accept (numbers);
    }

}
