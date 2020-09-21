package com.SoftUniFundamentals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine ());
        ArrayList<BigDecimal> decimals = new ArrayList<> ();

        for (int i = 0; i < n; i++) {
            decimals.add (scanner.nextBigDecimal ());
        }

       BigDecimal bigDecimal = decimals
               .stream ()
               .reduce (BigDecimal.valueOf (0), BigDecimal::add);

        System.out.println (bigDecimal);
    }
}