package AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main (String[] args) {


        Scanner scan = new Scanner(System.in);
        Map<String, Double> fmap = new LinkedHashMap<>();
        Map<String, Integer> smap = new LinkedHashMap<>();
        String line = "";
        while (!"buy".equals(line = scan.nextLine())){
            String[] command = line.split(" ");
            String product = command[0];
            double price  = Double.parseDouble(command[1]);
            int amaunt = Integer.parseInt(command[2]);

            if (!fmap.containsKey(product)){
                fmap.put(product, amaunt*price);
                smap.put(product, amaunt);
            }else {

                smap.put(product, smap.get(product)+amaunt);
                fmap.put(product, smap.get(product)*price);
            }
        }
        fmap.forEach((key, value) -> System.out.println(String.format("%s -> %.2f", key, value)));

    }
}
