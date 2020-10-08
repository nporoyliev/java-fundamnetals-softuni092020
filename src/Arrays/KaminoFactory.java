package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaminoFactory {

    public static class DNA {
        String[] dnaSequence;
        int sequenceOfOnes;
        int startingIndex;
        int endIndex;
        int totalSumOfOnes;
        int id;

        DNA(int size, int id){
            dnaSequence = new String[size];
            this.id = id;
        }

        DNA (int size, String[] sequence, int id) {
            dnaSequence = new String[size];
            dnaSequence = sequence;
            this.id = id;
        }

        private void analyzeDNA () {
            int counter = 0;
            int currentStartIndex = 0;
            int currentEndIndex = 0;
            int longestSequence = 0;


            for (int i = 0; i < dnaSequence.length; i++) {
                if (dnaSequence[i].equals ("1")) {
                    counter++;
                    totalSumOfOnes += 1;
                }
                if (dnaSequence[i].equals ("0")) {
                    currentEndIndex = i;
                    currentStartIndex = currentEndIndex - counter;
                    counter = 0;
                }

                if (currentEndIndex - currentStartIndex > longestSequence) {
                    longestSequence = currentEndIndex - currentStartIndex;
                    sequenceOfOnes = longestSequence;
                    startingIndex = currentStartIndex;
                    endIndex = currentEndIndex;
                }
            }
        }

        private String printSequence(){
            return String.join (" ", dnaSequence);
        }
    }

    public static DNA compareDNA (DNA testDNA, DNA secondDNA){
        if (testDNA.sequenceOfOnes < secondDNA.sequenceOfOnes){
            return secondDNA;
        } else  if (testDNA.startingIndex > secondDNA.startingIndex ){
            return secondDNA;
        } else  if (testDNA.totalSumOfOnes < secondDNA.totalSumOfOnes){
            return secondDNA;
        } else return testDNA;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<DNA> dnaList = new ArrayList<> ();

        int dnaLength = Integer.parseInt (scanner.nextLine ());
        int idCounter = 1;
        String input = scanner.nextLine ();

        while (!input.equals ("Clone them!")) {
            String[] split = input.split ("!");
            DNA dna = new DNA (dnaLength, split, idCounter);
            dna.analyzeDNA ();
            dnaList.add (dna);
            idCounter++;

            input = scanner.nextLine ();
        }


        DNA testDNA = new DNA (dnaLength, idCounter + 1);

        for (DNA dna : dnaList) {
       testDNA = compareDNA (testDNA, dna);
        }

        System.out.printf ("Best DNA sample %d with sum: %d.%n%s", testDNA.id, testDNA.totalSumOfOnes, testDNA.printSequence ());
    }
}
