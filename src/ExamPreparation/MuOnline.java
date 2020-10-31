package ExamPreparation;

import java.util.Scanner;

public class MuOnline {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        int initialHealth = 100;
        int initialBitcoin = 0;
        int bestRoom = 0;

        String[] rooms = scanner.nextLine ().split ("\\|");

        for (String room : rooms) {
            bestRoom++;
            String[] tokens = room.split ("\\s+");
            switch (tokens[0]) {
                case "potion":
                    int hp = Integer.parseInt (tokens[1]);
                    if (initialHealth + hp > 100) {
                        int currentHealing = 100 - initialHealth;
                        initialHealth = 100;
                        System.out.printf ("You healed for %d hp.%n", currentHealing);
                        System.out.printf ("Current health: %d hp.%n", initialHealth);
                    } else {
                        initialHealth += hp;
                        System.out.printf ("You healed for %d hp.%n", hp);
                        System.out.printf ("Current health: %d hp.%n", initialHealth);
                    }
                    break;
                case "chest":
                    int bitcoins = Integer.parseInt (tokens[1]);
                    initialBitcoin += bitcoins;
                    System.out.printf ("You found %d bitcoins.%n", bitcoins);
                    break;
                default:
                    int monsterAttack = Integer.parseInt (tokens[1]);
                    initialHealth -= monsterAttack;
                    if (initialHealth > 0) {
                        System.out.printf ("You slayed %s.%n", tokens[0]);
                    } else {
                        System.out.printf ("You died! Killed by %s.%n", tokens[0]);
                    }
                    break;
            }
            if (initialHealth <= 0) {
                System.out.printf ("Best room: %d%n", bestRoom);
                break;
            }
        }
        if (initialHealth > 0) {
            System.out.printf ("You've made it!%nBitcoins: %d%nHealth: %d", initialBitcoin, initialHealth);
        }
    }
}
