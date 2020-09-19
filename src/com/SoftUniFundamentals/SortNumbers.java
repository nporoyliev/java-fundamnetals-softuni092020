package com.SoftUniFundamentals;

import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            numbers.add(scanner.nextInt());
        }
        numbers.stream().sorted((f,s) -> s-f)
                .forEach(System.out::println);
    }
}
