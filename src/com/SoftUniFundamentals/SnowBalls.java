package com.SoftUniFundamentals;

import java.util.Scanner;

public class SnowBalls {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());

        int snowballQualityFinal = 0;
        int snowballTimeFinal = 0;
        int snowballSnowFinal = 0;
        double snowballValueFinal = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = scanner.nextInt ();
            int snowballTime = scanner.nextInt ();
            int snowballQuality = scanner.nextInt ();

            double snowballValue = (snowballSnow / snowballTime);
            snowballValue = Math.pow ((double)snowballValue,(double)snowballQuality);

            if (snowballValueFinal < snowballValue){
                snowballValueFinal = snowballValue;
                snowballSnowFinal = snowballSnow;
                snowballTimeFinal = snowballTime;
                snowballQualityFinal = snowballQuality;
            }
        }
        System.out.printf ("%d : %d = %.0f (%d)",
                snowballSnowFinal,
                snowballTimeFinal,
                snowballValueFinal,
                snowballQualityFinal);
    }
}
