package com.SoftUniFundamentals;

import java.util.Scanner;

public class Elevator {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int people = scanner.nextInt ();
        int capacity = scanner.nextInt ();

        if (people <= capacity) {
            System.out.println ("1");
        } else if (people % capacity != 0){
            System.out.println (people / capacity + 1);
        } else {
            System.out.println (people / capacity);
        }
    }
}
