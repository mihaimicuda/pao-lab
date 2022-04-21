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
    public List<String> citire(String filename) {

        try {
            File fisier = new File(filename);
            Scanner x = new Scanner(fisier);
            List <String> cuvinte = new ArrayList<>();

            while(fisier.hasNextLine()) {
                String cuvant = fisier.next().split("[!?.,()-{}]")[0];
                cuvinte.add(cuvant);
            }

            x.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }

        return cuvinte;
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here

        List <String> cuvinte = citire(fileName);
        List <String> cuvinte_lungime1 = new ArrayList();

        for(int i = 0; i < cuvinte.size(); i++) {
            for(int j = 0; j < cuvinte[i].size(); j++)
                if(cuvinte[i][j] == 1) {
                    cuvinte3.add(cuvinte[i][j]);
                }
        }

        return cuvinte_lungime1;

    }

    public List<String> getSizeLessThan3(String fileName) {

        List <String> cuvinte = citire(fileName);
        List <String> cuvinte3 = new ArrayList();

        for(int i = 0; i < cuvinte.size(); i++) {
            for(int j = 0; j < cuvinte[i].size(); j++)
                if(cuvinte[i][j] < 3) {
                    cuvinte3.add(cuvinte[i][j]);
                }
        }

        return cuvinte3;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        //TODO: add code here
        List <String> cuvinte = citire(fileName);

        for(int i = 0; i < cuvinte.size(); i++) {
            if(cuvinte[i].matches(word)) {
                cuvinte.add(word);
            }
        }

        return cuvinte;
    }
}
