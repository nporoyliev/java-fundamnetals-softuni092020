package com.SoftUniFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        names
                .stream()
                .filter(letter -> Character.isUpperCase(letter.charAt(0)))
                .sorted()
                .forEach(System.out::println);
    }
}
