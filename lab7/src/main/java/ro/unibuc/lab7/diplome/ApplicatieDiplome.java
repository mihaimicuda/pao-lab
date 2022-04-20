package ro.unibuc.lab7.diplome;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Predicate;

public class ApplicatieDiplome {
    public static void main(String[] args) {
        DiplomaService diplomaService = new DiplomaCsvService();

        Diploma diploma1 = new Diploma("1", "X", 2020, "unibuc", "info", 9.5);
        Diploma diploma2 = new Diploma("2", "Y", 2021, "unibuc", "info", 10);
        Diploma diploma3 = new Diploma("3", "Z", 1990, "unibuc", "info", 10);

        diplomaService.save(diploma1);
        diplomaService.save(diploma2);
        diplomaService.save(diploma3);

        System.out.println(diplomaService.findDiplomasBetweenYears(2000, 2022));
        System.out.println(diplomaService.findAllByPerfectScore());

        diplomaService.delete(diploma2);
        System.out.println(diplomaService.getAll());

        diplomaService.delete(diploma1);
        System.out.println(diplomaService.getAll());

        /*
        Custom filtering: <atribut> <relatie> <valoare>
        relatie: =, >, <, !=
        atribut: serie, absolvent, an,...

        serie = 1
         */

        /*
        1. citire de la consola
        2. convertire de la string la atribut
        3. convertire de la string la relatie
         */

        /*
        Predicate este o interfata functionala. Interfetele functionale au fost introduse in java 8
        Interfata functionala = Interfata cu o singura metoda
        @FunctionalInterface - adnotare din java standard care se asigura ca interfata are o singura metoda

        lambda -> o metoda de scriere a unei implementari de interfata functionala
        lambda -> inlocuieste o clasa anonima care implementeaza o interfata

        clasa anonima:
        new Predicate<Diploma>() {
            @Override
            public boolean test(Diploma diploma) {
                return false;
            }
        }

         */
        Collections.sort(Arrays.asList(diploma1, diploma2, diploma3), (o1, o2) -> o2.getAn() - o1.getAn());
        Collections.sort(Arrays.asList(diploma1, diploma2, diploma3), (o1, o2) -> (int)(o2.getMedie() - o1.getMedie()));

        diplomaService.save(diploma1);
        diplomaService.save(diploma2);
        diplomaService.save(diploma3);

        System.out.println(diplomaService.findByCustomFilter(diploma -> false)); // -> nu returneaza nici o diploma
        System.out.println(diplomaService.findByCustomFilter(diploma -> diploma.getAn() == 2021));;
        System.out.println(diplomaService.findByCustomFilter(diploma -> diploma.getAn() == 2020));

        System.out.println(diplomaService.findByCustomFilter(diploma -> diploma.getMedie() == 10));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter query:");
        String query = scanner.nextLine();
        String[] queryParams = query.split(" ") ;

        //exemplu: "serie = 1"
        System.out.println("atribut: " + queryParams[0]);
        System.out.println("relatie: " + queryParams[1]);
        System.out.println("valoare: " + queryParams[2]);
    }
}
