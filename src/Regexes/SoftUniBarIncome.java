package Regexes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regexPattern = "^%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*" +
                "\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$$";
        Pattern pattern = Pattern.compile(regexPattern);

        String input = scanner.nextLine();
        double totalAmount = 0.0;

        while(!"end of shift".equals(input)){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.printf("%s: %s - %.2f%n", matcher.group("name"), matcher.group("product"),
                        Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price")));
                totalAmount += Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalAmount);
    }
}
