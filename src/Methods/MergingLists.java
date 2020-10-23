package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<Integer> firstList = ListInitiation (scanner);
        List<Integer> secondList = ListInitiation (scanner);

        List<Integer> finalList = MergeCommonElements (firstList, secondList);

        for (int i = Math.min(firstList.size (), secondList.size ()); i < Math.max (firstList.size (),secondList.size ()); i++) {
           if (firstList.size () < secondList.size ()){
               finalList.add (secondList.get (i));
           } else {
               finalList.add (firstList.get (i));
           }
        }

        for (Integer number : finalList) {
            System.out.print (number + " ");
        }




    }

    private static List<Integer> MergeCommonElements (List<Integer> firstList, List<Integer> secondList) {
        List<Integer> finalList = new ArrayList<> ();

        for (int i = 0; i < Math.min (firstList.size (), secondList.size ()); i++) {
            finalList.add (firstList.get (i));
            finalList.add (secondList.get (i));
        }
        return finalList;
    }

    private static List<Integer> ListInitiation (Scanner scanner) {
        List<Integer> numbers = Arrays.stream (scanner.nextLine ().split ("\\s+"))
                .map (Integer::parseInt)
                .collect (Collectors.toList ());

        return numbers;
    }
}
