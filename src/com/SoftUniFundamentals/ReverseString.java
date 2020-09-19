package com.SoftUniFundamentals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = input.length() -1 ; i >=0 ; --i) {
            result.append(input.charAt(i));
        }

        System.out.println(result);
    }
}
