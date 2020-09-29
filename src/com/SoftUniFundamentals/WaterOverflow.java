package com.SoftUniFundamentals;

import java.util.Scanner;

public class WaterOverflow {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = scanner.nextInt ();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt ();
            if (sum + num <= 255) {
                sum += num;
            } else {
                System.out.println ("Insufficient capacity!");
            }
        }

        System.out.println (sum);
    }
}
