package com.SoftUniFundamentals;

import java.util.Scanner;

public class SumOfDigits {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        int number = scanner.nextInt ();
        int result = 0;

        while (number > 0) {

            result += number % 10;
            number /= 10;

        }
        System.out.println (result);
    }
}
