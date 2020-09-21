package com.SoftUniFundamentals;

import java.util.Scanner;

public class CharsToString {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        StringBuilder result = new StringBuilder ();
        for (int i = 0; i < 3; i++) {
            result.append (scanner.nextByte ());
        }
        System.out.println (result);
    }
}
