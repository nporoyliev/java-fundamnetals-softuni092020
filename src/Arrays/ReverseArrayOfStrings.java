package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseArrayOfStrings {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] input = scanner.nextLine ().split ("\\s+");

        System.out.println (Arrays.stream (input).sorted (Comparator.reverseOrder ())
                .collect (Collectors.joining (" ")));


    }
}

