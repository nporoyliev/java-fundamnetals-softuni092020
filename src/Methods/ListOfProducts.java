package Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ListOfProducts {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(scanner.nextLine());
        }
        AtomicInteger counter = new AtomicInteger();
        products.stream().sorted(String::compareTo)
        .forEach(product ->{
            counter.getAndIncrement();
         System.out.println(counter + "." + product);
        });

    }
}
