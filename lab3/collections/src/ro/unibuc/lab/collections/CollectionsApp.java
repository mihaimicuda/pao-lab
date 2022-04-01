package ro.unibuc.lab.collections;

import java.util.*;

public class CollectionsApp {
    /**
     * List -> colectie ordonata care poate fi accesata printr-un index
     * Set -> colectie unde toate datele sunt unice
     * Queue -> structura ordonata de tip LIFO/FIFO
     * Map -> set de perechi cheie/valoare
     * Iterator -> folosit pentru a itera peste colectii
     * @param args
     */

    public static void main(String[] args) {
        int[] arr = new int[5];

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(arr[0]);
        intList.get(0); // get arr[0]

        intList.size(); //
        System.out.println(arr.length);

        ArrayList<Integer> secondList = new ArrayList<>(5); //start with capacity 5, doubles when adding the 6th element
        Arrays.asList(arr);

        intList.addAll(Arrays.asList(1, 3, 4, 5, 10));

        System.out.println(intList);
        intList.remove(0);
        System.out.println(intList);

        ArrayList<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat(1, "George"));
        angajati.add(new Angajat(2, "Ion"));

        System.out.println(angajati);

        angajati.remove(new Angajat(1, "George")); //does nothing
        System.out.println(angajati);

        System.out.println("--------------");
        ArrayList<Angajat> altiAngajati = new ArrayList<>();
        Angajat george = new Angajat(1, "George");
        Angajat ion = new Angajat(2, "Ion");
        altiAngajati.add(george);
        altiAngajati.add(ion);

        System.out.println(altiAngajati);
        altiAngajati.remove(george);
        System.out.println(altiAngajati); //egalitatea la nivelul angajat este bazata pe egalitatea referintei

        System.out.println("------------------");
        HashSet<Angajat> angajatiUnici = new HashSet<>();
        angajatiUnici.add(new Angajat(3, "Marius"));
        angajatiUnici.add(new Angajat(3, "Marius"));
        System.out.println(angajatiUnici);

        //angajatiUnici.get(0) -> set nu se poate accesa printr-un index
        for(Angajat angajat : angajatiUnici) {
            System.out.println(angajat);
            angajat.nume = "Geo";
        }


    }
}
