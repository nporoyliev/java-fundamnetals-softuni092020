package com.SoftUniFundamentals;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt (0);

        if (input >= 97){
            System.out.println ("lower-case");
        } else {
            System.out.println ("upper-case");
        }
    }

}
