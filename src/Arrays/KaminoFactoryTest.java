package Arrays;

import java.util.*;

public class KaminoFactoryTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int sequenceLength = Integer.parseInt(scanner.nextLine());

        List<DNA> dnaSequence = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("Clone them!")) {
            dnaSequence.add(new DNA(input.split("!")));
            input = scanner.nextLine();
        }

        DNALibrary library = new DNALibrary(dnaSequence);


        Optional<DNA> first = dnaSequence.stream().sorted(Comparator.comparing(DNA::getSequenceOfOnes)
                .thenComparing(DNA::getStartingIndex)
                .thenComparing(DNA::calculateTotalSumOfOnes))
                .findFirst();

        first.stream()
                .forEach(DNA::printSequence);


    }

//   private static void sortByTotalSumOfOnes(List<DNA> dnaList) {
//       dnaList.stream()
//               .sorted((f, s) -> s.getTotalSumOfOnes() - f.getTotalSumOfOnes());
//   }


//   private static void sortDNAListByStartIndex(List<DNA> dnaList) {
//       dnaList.stream()
//               .sorted((f, s) -> f.getStartingIndex() - s.getStartingIndex())
//               .collect(Collectors.toList());
//   }

//   private static void analyzeDNAList(List<DNA> dnaList) {
//       dnaList.stream()
//               .forEach(dna -> {
//                   dna.analyzeDNA(dna.getDnaSequence());
//                   dna.calculateTotalSumOfOnes();
//               });
//   }
}
