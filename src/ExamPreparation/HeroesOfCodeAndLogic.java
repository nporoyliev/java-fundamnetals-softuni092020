package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class HeroesOfCodeAndLogic {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        Map<String, Integer> heroHP = new HashMap<> ();
        Map<String, Integer> heroMP = new HashMap<> ();

        int n = Integer.parseInt (scanner.nextLine ());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine ().split ("\\s+");
            String heroName = tokens[0];
            int health = Integer.parseInt (tokens[1]);
            if (health > 100) {
                health = 100;
            }
            int mana = Integer.parseInt (tokens[2]);
            if (mana > 200) {
                mana = 200;
            }

            if (!heroHP.containsKey (heroName)) {
                heroHP.put (heroName, health);
                heroMP.put (heroName, mana);
            }
        }
        String input;
        while (!"End".equals (input = scanner.nextLine ())) {

            String[] split = input.split (" - ");
            String command = split[0];
            String heroName = split[1];

            switch (command) {
                case "CastSpell":

                    int requiredMP = Integer.parseInt (split[2]);
                    String spellName = split[3];

                    if (heroMP.get (heroName) >= requiredMP) {
                        heroMP.put (heroName, heroMP.get (heroName) - requiredMP);
                        System.out.printf ("%s has successfully cast %s and now has %d MP!%n",
                                heroName, spellName, heroMP.get (heroName));
                    } else {
                        System.out.printf ("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":

                    int damageTaken = Integer.parseInt (split[2]);
                    String attacker = split[3];

                        if (heroHP.get (heroName) > damageTaken) {
                            heroHP.put (heroName, heroHP.get (heroName) - damageTaken);
                            System.out.printf ("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damageTaken, attacker,
                            heroHP.get (heroName));
                        } else {
                            System.out.println (heroName + " has been killed by " + attacker +"!");
                        }

                    break;
                case "Recharge":
                    int amountMana = Integer.parseInt (split[2]);
                    if (heroMP.get (heroName) + amountMana > 200) {
                        heroMP.put (heroName, 200);
                        System.out.printf ("%s recharged for %d MP!%n", heroName, 200 - amountMana);
                    } else {
                        heroMP.put (heroName, heroMP.get (heroName) + amountMana);
                        System.out.printf ("%s recharged for %d MP!%n", heroName, amountMana);
                    }
                    break;
                case "Heal":
                    int healPoints = Integer.parseInt (split[2]);
                    if (heroHP.get (heroName) + healPoints > 100) {
                        heroHP.put (heroName, 100);
                        System.out.printf ("%s healed for %d HP!%n", heroName, 100 - healPoints);
                    } else {
                        heroHP.put (heroName, heroHP.get (heroName) + healPoints);
                        System.out.printf ("%s healed for %d HP!%n", heroName, healPoints);
                    }
                    break;
                default:
                    System.out.println ("Invalid command");
                    break;
            }
        }

        Stream<Map.Entry<String, Integer>> sortedHeroes = heroHP.entrySet ()
                .stream ()
                .filter (hero -> hero.getValue () > 0)
                .sorted ((first, second) -> {
                    int result = second.getValue () - first.getValue ();
                    if (result == 0) {
                        result = first.getKey ().compareTo (second.getKey ());
                    }
                    return result;
                });
        sortedHeroes.forEach (hero -> {
            System.out.printf ("%s%n", hero.getKey ());
            System.out.printf ("  HP: %d%n", hero.getValue ());
            System.out.printf ("  MP: %d%n", heroMP.get (hero.getKey ()));
        });
    }
}
