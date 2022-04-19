package ro.unibuc.collections;

import java.util.Comparator;

public class ComparatorCaini implements Comparator<Caine> {

    @Override
    public int compare(Caine o1, Caine o2) {
        return o1.varsta - o2.varsta;
    }

}
