package ro.unibuc.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingStuff {
    public static void main(String[] args) {
        Pisica tom = new Pisica("Tom", 4, 4);
        Pisica mitzi = new Pisica("Mitiz", 6, 5);

//        System.out.println(tom.compareTo(mitzi));

        Pisica tom2 = new Pisica("Tom", 4, 9);
        Pisica tom3 = new Pisica("Tom", 6, 5);
//        System.out.println(tom2.compareTo(tom3));

        ComparatorCaini comparatorCaini = new ComparatorCaini();
        System.out.println(comparatorCaini.compare(
                new Caine("Grivei", "Golden", 2),
                new Caine("Max", "rotweiller", 4)));

        Comparator<Pisica> compPisici = new Comparator<Pisica>() {
            @Override
            public int compare(Pisica o1, Pisica o2) {
                return o1.greutate - o2.greutate;
            }
        };
        System.out.println(compPisici.compare(tom2, tom3));


        List<Pisica> pisici = Arrays.asList(tom, mitzi, tom2, tom3);

        Collections.sort(pisici);
        System.out.println("sorted natural order: " + pisici);

        Collections.sort(pisici, new Comparator<Pisica>() {
            @Override
            public int compare(Pisica o1, Pisica o2) {
                return o1.greutate - o2.greutate;
            }
        });

        Collections.sort(pisici, (o1, o2) -> o1.greutate - o2.greutate);
    }
}
