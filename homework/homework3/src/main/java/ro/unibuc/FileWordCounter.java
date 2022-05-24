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

    private int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            while (scanner2.hasNext()) {
                String word = scanner2.next();
                if(word.length() == 1) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            while (scanner2.hasNext()) {
                String word = scanner2.next();
                if(word.length() < 3) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            while (scanner2.hasNext()) {
                String w = scanner2.next();
                if(w.equals(word) || w.contains(word)) {
                    words.add(w);
                }
            }
        }
        return words;
    }

    public List<String> getWordsGreaterThanX(String fileName) {
        List<String> words = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            while (scanner2.hasNext()) {
                String word = scanner2.next();
                if(word.length() > limit) {
                    words.add(word);
                }
            }
        }
        return words;
    }
}
