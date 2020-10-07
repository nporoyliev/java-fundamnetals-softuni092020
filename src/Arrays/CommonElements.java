package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<String> firstSet;
        Set<String> secondSet;



        firstSet = Arrays.stream(scanner.nextLine ().split ("\\s+")).collect (Collectors.toSet ());
        secondSet = Arrays.stream(scanner.nextLine ().split ("\\s+")).collect (Collectors.toSet ());

        Set<String> resultSet = firstSet.stream ()
                .filter (secondSet::contains)
                .collect (Collectors.toSet ());

        printSet (resultSet);


        //     firstSet.retainAll (secondSet);
  //     printSet(firstSet);
    }

    private static void printSet (Set<String> set) {
        for (String s : set) {
            System.out.print (s + " ");
        }
    }
}
