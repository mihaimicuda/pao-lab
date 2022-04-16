package ro.unibuc;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;


/**
 TODO:
 scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
 Lungimea n trebuie introdusa de la tastatura.
 In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    public List<String> numaraN (String fileName, int n) {
        List<String> lista = new ArrayList<String>();
        try {
            Scanner fileReader = new Scanner(new File(fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] wordsOnLine = line.split(" ");
                for (String s : wordsOnLine) {
                    if(s.length() < n) {
                        lista.add(s);
                    }

                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return lista;
    }


    public List<String> cuvant (String fileName, String cuvant) {
        List<String> lista = new ArrayList<String>();
        try {

            Scanner fileReader = new Scanner(new File(fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] wordsOnLine = line.split(" ");
                for (String s : wordsOnLine) {
                    if(s.replace("!", "").equals(cuvant)){
                        lista.add(s);
                    }
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return lista;
    }

    public List<String> getSizeOne(String fileName) {
        return this.numaraN(fileName,2);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return this.numaraN(fileName,3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return this.cuvant(fileName,word);
    }
}
