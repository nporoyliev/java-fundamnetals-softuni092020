package com.SoftUniFundamentals;

import java.util.Scanner;

public class BeerKegs {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine ());
        String biggestModel = "";
        double biggestVolume = 0;
        for (int i = 0; i < n; i++) {

            String currentModel = scanner.nextLine ();

            double radius = Double.parseDouble (scanner.nextLine ());
            int height = Integer.parseInt (scanner.nextLine ());
            double currentVolume = Math.PI * Math.pow (radius, 2) * height;

            if (currentVolume > biggestVolume) {
                biggestModel = currentModel;
                biggestVolume = currentVolume;
            }

        }

        System.out.println (biggestModel);
    }
}
