package com.SoftUniFundamentals;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int startingYield = scanner.nextInt ();
        int totalYield = 0;
        int days = 0;

        while (startingYield >= 100){
            totalYield += startingYield;
            startingYield -= 10;
            if (totalYield < 26){
                totalYield = 0;
            } else {
                totalYield -= 26;
            }
            days++;
        }
        System.out.println (days);
        System.out.println (totalYield - 26);
    }
}
