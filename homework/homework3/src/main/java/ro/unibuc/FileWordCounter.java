package ro.unibuc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
    TODO:
    Scrieti o clasa java care sa returneze toate cuvintele de lungime > n dintr-un fisier text.
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> countWordsByLength(String fileName, int n) {
        List<String> countedWords = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            reader.lines().forEach(line -> {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > 1) {
                        if (! Character.isLetter(word.charAt(0))) { //stringul nu incepe cu o litera
                            word = word.substring(1); // elimina caracterul de la inceputul cuvantului
                        }
                        if (! Character.isLetter(word.charAt(word.length()-1))) { //stringul nu se termina cu o litera
                            word = word.substring(0, word.length()-1); // elimina caracterul de la sfarsitul cuvantului
                        }
                    }
                    if (word.length() > n) {
                        countedWords.add(word);
                    }
                }
            });
        } catch (FileNotFoundException ex) {
            System.out.println("Fisierul nu exista!");
        }
        catch(IOException ex) {
            System.out.println("Operatie de citire esuata!");
        }
        return countedWords;
    }


    public List<String> getFilteredWords(String fileName, Predicate<String> rightLength) {
        List<String> allWords = countWordsByLength(fileName, 0);
        List<String> countedWords = new ArrayList<>();
        for (String word : allWords)
            if (rightLength.test(word))
                countedWords.add(word);
        return countedWords;
    }


    public List<String> getSizeOne(String fileName) {
        Predicate<String> lengthOne = word -> word.length() == 1;
        return getFilteredWords(fileName, lengthOne);
    }


    public List<String> getSizeLessThan3(String fileName) {
        Predicate<String> lengthLessThan3 = word -> word.length() < 3;
        return getFilteredWords(fileName, lengthLessThan3);
    }


    public List<String> countWordAppearances(String fileName, String word) {
        Predicate<String> searchedLength = w -> w.length() == word.length();
        List<String> potentialWords = getFilteredWords(fileName, searchedLength);
        List<String> matchedWords = new ArrayList<>();
        for (String w : potentialWords) {
            if (word.equals(w))
                matchedWords.add(w);
        }
        return matchedWords;
    }
}
