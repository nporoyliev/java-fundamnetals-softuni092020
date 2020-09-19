package com.SoftUniFundamentals;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int numberLostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double damageCosts = 0;
        int keyboardCounter = 0;

        for (int i = 1; i <= numberLostGames ; i++) {
            if (i % 2 ==0){
                damageCosts += headSetPrice;
            }
            if (i % 3 == 0){
                damageCosts += mousePrice;
            }
            if (i % 2 == 0 && i % 3 == 0){
                damageCosts += keyboardPrice;
                keyboardCounter++;
                if (keyboardCounter % 2 == 0){
                    damageCosts += displayPrice;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", damageCosts);
    }
}
