package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DNALibrary  implements Iterable<DNA> {
    List<DNA> dnaList = new ArrayList<>();

    public DNALibrary(List<DNA> dnaList){
        this.dnaList = dnaList;
    }

    @Override
    public Iterator<DNA> iterator() {
        return new libraryIterator();
    }

    private final class libraryIterator implements Iterator<DNA>{
        public int index = 0;
        @Override
        public boolean hasNext() {
            return index < dnaList.size();
        }

        @Override
        public DNA next() {
            return dnaList.get(index++);

        }
    }
}
