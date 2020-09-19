package com.SoftUniFundamentals;

import java.util.*;

public class GamingStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Double> games = new HashMap<>();
        List<String> boughtGames = new ArrayList<>();

        games.put("OutFall 4", 39.99);
        games.put("CS:OG", 15.99);
        games.put("Zplinter Zell", 19.99);
        games.put("Honored 2", 59.99);
        games.put("RoverWatch", 29.99);
        games.put("RoverWatch Origins Edition", 39.99);


        double currentBalance = Double.parseDouble(scanner.nextLine());
        double totalSpent = 0;
        boolean outOfMoney = false;


        String input = scanner.nextLine();
        while (!"Game Time".equals(input)) {

            if (games.containsKey(input)) {
                if (games.get(input) <= currentBalance) {
                    currentBalance -= games.get(input);
                    totalSpent += games.get(input);
                    boughtGames.add(input);
                } else {
                    System.out.println("Too Expensive");
                }
            } else {
                System.out.println("Not Found");
            }
            if (currentBalance == 0) {
                outOfMoney = true;
                break;
            }
            input = scanner.nextLine();
        }

            boughtGames.forEach(e -> System.out.println("Bought " + e));
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
        if (outOfMoney){
            System.out.println("Out of money!");
        }
    }
}
