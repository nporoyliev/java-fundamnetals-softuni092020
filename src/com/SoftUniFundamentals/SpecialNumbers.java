package com.SoftUniFundamentals;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int number = scanner.nextInt ();
        int result;
        for (int i = 1; i <= number; i++) {
            int temp = i;
            result = 0;
            while (temp > 0) {
                result += temp % 10;
                temp /= 10;
            }
            if (result == 7 || result == 5 || result == 11) {
                System.out.printf ("%d -> True%n", i);
            } else {
                System.out.printf ("%d -> False%n", i);
            }
        }

    }
}
