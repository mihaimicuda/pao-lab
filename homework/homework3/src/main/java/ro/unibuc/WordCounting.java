package ro.unibuc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();

        //TODO: add code here to read from console and get the length limit

        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti numarul N: ");
        int n = in.nextInt(); //citesc numarul n de la tastatura

        //apelez functia getSizeN din clasa FileWordCounter pentru fisierul poezie 1 si numarul n dat de la tastaura
        //pentru a rula exercitiul este posibil sa fie nevoie sa actualizati pathul fisierului
        List<String> cuvinte = fileWordCounter.getSizeMoreThanN("homework/homework3/src/test/resources/poezie1.txt", n);

        System.out.println(cuvinte);

    }
}
