package Arrays;

public class DNA {
    static int currentId = 1;

    private String[] dnaSequence;
    private int sequenceOfOnes;
    private int startingIndex;
    private int endIndex;
    private int totalSumOfOnes;
    private int id;


    public DNA (String[] sequence) {
        this.dnaSequence = sequence;
        this.id = currentId;
        increaseId ();
    }

    public void increaseId () {
        currentId += 1;
    }


    public int getSequenceOfOnes () {
        return sequenceOfOnes;
    }

    public void setSequenceOfOnes (int sequenceOfOnes) {
        this.sequenceOfOnes = sequenceOfOnes;
    }

    public int getStartingIndex () {
        return startingIndex;
    }

    public void setStartingIndex (int startingIndex) {
        this.startingIndex = startingIndex;
    }

    public String[] getDnaSequence () {
        return dnaSequence;
    }

    public int getEndIndex () {
        return endIndex;
    }

    public void setEndIndex (int endIndex) {
        this.endIndex = endIndex;
    }

    public int calculateTotalSumOfOnes () {
        int sum = 0;
        for (int i = 0; i < dnaSequence.length; i++) {
            if (dnaSequence[i].equals ("1")) {
                sum += 1;
            }
        }
        return sum;
    }

    public int getTotalSumOfOnes () {
        return totalSumOfOnes;
    }

    public void setTotalSumOfOnes (int totalSumOfOnes) {
        this.totalSumOfOnes = calculateTotalSumOfOnes ();
    }


    public void analyzeDNA (String[] dnaSequence) {
        int counter = 0;
        int currentIndex = 0;
        int sequenceLength = 0;


        for (int i = 0; i < dnaSequence.length; i++) {
            if (dnaSequence[i].equals ("1")) {
                counter++;
            }
            if (dnaSequence[i].equals ("0")) {
                currentIndex = i;
                if (sequenceLength < counter){
                    sequenceLength = counter;
                    counter = 0;
                    setEndIndex (currentIndex);
                    setStartingIndex (currentIndex - counter);
                    setSequenceOfOnes (counter);
                }
            }
        }
    }

    public void printSequence(){
        for (String s : dnaSequence) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }

}


