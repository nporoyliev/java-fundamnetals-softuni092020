package com.SoftUniFundamentals;

import java.util.Scanner;

public class RefractorSpecialNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int counter = Integer.parseInt (scanner.nextLine ());

        int result = 0;
        for (int number = 1; number <= counter; number++) {
            int temp = number;
            while (temp > 0) {
                result += temp % 10;
                temp = temp / 10;
            }
            boolean isSpecialNumber = (result == 5) || (result == 7) || (result == 11);
            System.out.printf ("%d -> %b%n", number, isSpecialNumber);
            result = 0;
        }
    }
}
