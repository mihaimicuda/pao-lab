package ro.unibuc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileWordCounter {


    public List<String> getSizeOne(String fileName) {
        File file = new File(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String text_line;
            List<String> list = new ArrayList<String>();
            while ((text_line = fileReader.readLine()) != null) {  ///citeste pana la capatul fisierului
                String[] words = text_line.split(" "); ///citim pana dam de spatiu
                for (String word : words) ///parcurgem fiecare cuvant in parte
                    if (word.length() == 1)///daca cuvantul este de dimensiune 1 atunci il adaugam in lista creata mai sus
                        list.add(word);
            }
            return list;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> getSizeLessThan3(String fileName) {
        File file = new File(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String text_line;
            List<String> list = new ArrayList<String>();
            while ((text_line = fileReader.readLine()) != null) {
                String[] words = text_line.split(" ");
                for (String word : words)
                    if (word.length() < 3) ///este la fel ca modelul de mai sus doar ca acum dimensiunea treb sa fie mai mica decat 3
                        list.add(word);
            }
            return list;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        File file = new File(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String text_line;
            List<String> list = new ArrayList<String>();
            while ((text_line = fileReader.readLine()) != null) {
                String[] words = text_line.split(" ");
                for (String cuvant : words)
                    if (cuvant.equals(word) || cuvant.equals(word + "!")) ///verific daca cuvantul gasit este egal cu cel dat din parametru,
                        list.add(word);                                     ///iar pentru cazul capitan avem si capitan!, deci tratam exceptia
            }
            return list;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int wordsBiggerThanN(String word_chosen, int n){
        String[] words = word_chosen.split(" ");
        int k = 0;
        for (String word : words)
            if (word.length() > n){
                System.out.println(word);
                k++;}


        return k;
    }

}
