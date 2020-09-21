package com.SoftUniFundamentals;

import java.util.Scanner;

public class ConvertMeterToKm {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        double meters = scanner.nextInt ();
        System.out.printf ("%.2f", meters / 1000);
    }
}
