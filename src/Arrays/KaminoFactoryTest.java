package Arrays;

public class KaminoFactoryTest {

    static int currentId = 1;

    class DNA {
        private String[] dnaSequence;
        private int sequenceOfOnes;
        private int startingIndex;
        private int endIndex;
        private int totalSumOfOnes;
        private int id;


        public DNA (int id, String[] sequence){
            this.dnaSequence = sequence;
            this.id = id;
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

        public int getEndIndex () {
            return endIndex;
        }

        public void setEndIndex (int endIndex) {
            this.endIndex = endIndex;
        }

        public int getTotalSumOfOnes () {
            return totalSumOfOnes;
        }

        public void setTotalSumOfOnes (int totalSumOfOnes) {
            this.totalSumOfOnes = totalSumOfOnes;
        }

        public int getId () {
            return id;
        }

        public void setId (int id) {
            this.id = id;
        }

        public void analyzeDNA (String[] dnaSequence){
            int counter =0;
            int currentIndex = 0;
            int sum = 0;

            for (int i = 0; i < dnaSequence.length; i++) {
                if (dnaSequence[i].equals ("1")){
                    currentIndex = i;
                    setStartingIndex (currentIndex);
                    sum += 1;
                }
            }
        }

    }

    public static void main (String[] args) {

    }
}
