package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> lungimeN (String fileName, int n) {
        List<String> list = new ArrayList<String>();
        try {
            File fileReader = new File(fileName);
            Scanner reader = new Scanner(fileReader);
            String rand = reader.nextLine();
            String word = null;
            while(reader.hasNextLine()){
                String[] cuvs = rand.split("[, ]"); // aici citeste pana da de un spatiu sau o virgula
                // iar acum o sa parcurgem lista cu fiecare cuvant in parte...iar daca o sa gasim un cuvant cu o lungime
                // mai mare decat n il adaugam in lista sau daca acel cuvant are "!" la final ii stergem "!" si il adaugam
                // pt asta am folosit metoda replace
                for(String cuv : cuvs) {
                    if(cuv.length() < n || cuv.replace("!", "").equals(word) || cuv.length() == 1)
                        list.add(cuv);
                }
            }
            reader.close();
        } catch (FileNotFoundException exc) {
            System.out.println("Eroare");
        }
        return list;
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        return Collections.emptyList();
        //return this.lungimeN(fileName,2);
        //Nu inteleg de ce imi da unreachable statement...m-am chinuit si nu am putut sa depanez
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        return Collections.emptyList();
        //return this.lungimeN(fileName,3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        //TODO: add code here
        return Collections.emptyList();
        //return this.lungimeN(fileName, word);
    }
}
