package com.SoftUniFundamentals;

import java.util.Scanner;

public class TriplesOfLatinNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt ();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf ("%c%c%c%n", ('a' + i), ('a'+ j),('a'+k));
                }
            }
        }
    }
}
