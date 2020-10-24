package Arrays;

import java.util.Comparator;

public class CompareDNABySequenceLength implements Comparator<DNA> {
    @Override
    public int compare(DNA o1, DNA o2) {
        return Integer.compare(o1.getSequenceOfOnes(),o2.getSequenceOfOnes());
    }
}
