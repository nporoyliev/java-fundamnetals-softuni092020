package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .map (Integer::parseInt)
                .collect (Collectors.toList ());

        double average = (numbers.stream ()
                .reduce (0, Integer::sum) / numbers.size ());

        List<Integer> result = numbers.stream ()
                .filter (num -> num > average)
                .sorted ()
                .collect (Collectors.toList ());

        if (result.isEmpty ()){
            System.out.println ("No");
        } else {
            int size = result.size();
            int counter = 5;
            while(size-- > 0 && counter-- > 0){
                System.out.print (result.get (size) + " ");
            }
        }


    }
}
