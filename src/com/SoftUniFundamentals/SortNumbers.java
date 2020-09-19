package com.SoftUniFundamentals;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        Set<Integer> numbers = new TreeSet<>();

        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        numbers.stream().sorted((f,s) -> s-f)
                .forEach(System.out::println);
    }
}
