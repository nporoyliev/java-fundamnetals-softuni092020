package com.SoftUniFundamentals;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalMoney = Double.parseDouble(scanner.nextLine());
        double numberOfStudents = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = (int) (numberOfStudents / 6);

        double totalPrice = lightsaberPrice*(numberOfStudents + Math.ceil(numberOfStudents * 0.1)) + (numberOfStudents*robePrice) + beltPrice*(numberOfStudents - freeBelts);
        if (totalMoney <= totalMoney){
            System.out.printf("The money is enough - it would cost %.2f lv.", totalPrice);
        } else {
            System.out.printf("Ivan Cho whill need %.2f lv more.", totalPrice - totalMoney);
        }
    }
}
