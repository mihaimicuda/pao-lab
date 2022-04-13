package ro.unibuc.lab.collections;

import java.util.*;

public class MapApp {
    public static void main(String[] args) {

        HashMap<String, Integer> catalog = new HashMap<>();
        catalog.put("George", 10);
        catalog.put("Ion", 9);
        System.out.println(catalog);

        HashMap<String, List<Integer>> catalogFull = new HashMap<>();
        catalogFull.put("George", Arrays.asList(10, 8, 7));

        System.out.println(catalogFull.get("George"));

        HashMap<Angajat, Integer> catalogAngajat = new HashMap<>();
        catalogAngajat.put(new Angajat(1, "George"), 10);
        catalogAngajat.put(new Angajat(2, "Andrei"), 10);
        System.out.println(catalogAngajat);
        /*
        If Angajat.equals() returns true and Angajat.hashcode returns 1,
        map will only have 1 entry
         */

        for(Map.Entry entry : catalogAngajat.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
