package Regexes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String namePattern = "\\b[A-Z][a-z]+\\s[A-Z][a-z]+\\b";

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}