package com.SoftUniFundamentals;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int power = scanner.nextInt();
        int distance = scanner.nextInt();
        int exhaustionFactor = scanner.nextInt();

        int startingPower = power;
        int pokesCount = 0;

        while (power >= distance) {
            pokesCount++;
            power -= distance;
            if (power == (startingPower * 0.5)) {
                power /= exhaustionFactor;
            }

        }

        System.out.println(power);
        System.out.println(pokesCount);
    }
}
