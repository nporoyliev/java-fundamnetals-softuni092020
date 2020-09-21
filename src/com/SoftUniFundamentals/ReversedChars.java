package com.SoftUniFundamentals;

import java.util.Scanner;

public class ReversedChars {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        StringBuilder result = new StringBuilder ();
        for (int i = 0; i < 3; i++) {
            result.append (scanner.nextLine ());
        }
        for (int i = result.length () - 1; i >= 0; --i) {
            System.out.print (result.charAt (i) + " ");
        }
    }
}
