package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KaminoFactoryTest {

    public static void main (String[] args) {


        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());

        List<DNA> dnaList = new ArrayList<>();

        String input = scanner.nextLine();
        while(!input.equals ("Clone them!")){
            String[] split = input.split ("!");
            dnaList.add (new DNA(split));
            input = scanner.nextLine();
        }

        analyzeDNAList (dnaList);

        sortDNAListByStartIndex (dnaList);

        sortByTotalSumOfOnes (dnaList);


        for (DNA dna : dnaList) {
            dna.printSequence ();
        }
    }

    private static void sortByTotalSumOfOnes (List<DNA> dnaList) {
        dnaList.stream ()
                .sorted ((f,s) -> s.getTotalSumOfOnes () - f.getTotalSumOfOnes ());
    }

    private static void sortDNAListByStartIndex (List<DNA> dnaList) {
        dnaList.stream ()
                .sorted ((f,s) -> f.getStartingIndex () - s.getStartingIndex ())
                .collect(Collectors.toList());
    }

    private static void analyzeDNAList (List<DNA> dnaList) {
        dnaList.stream ()
                .forEach (dna -> {
                    dna.analyzeDNA (dna.getDnaSequence ());
                    dna.calculateTotalSumOfOnes ();
                });
    }
}
