package Methods;

import java.util.Scanner;

public class Orders {
    public static void main (String[] args) {


        Scanner scanner = new Scanner (System.in);

        String product = scanner.nextLine ();

        double quantity = scanner.nextInt ();

        priceCalculator (product, quantity);
    }

    private static void priceCalculator (String product, double quantity) {
        switch (product) {
            case "coffee":
                System.out.printf ("%.2f", (1.5 * quantity));
                break;
            case "water":
                System.out.printf ("%.2f", ( 1 * quantity));
                break;
            case "coke":
                System.out.printf ("%.2f", (1.4 * quantity));
                break;
            case "snacks":
                System.out.printf ("%.2f", (2 * quantity));
                break;
        }
    }
}

