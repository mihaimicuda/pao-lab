package ro.unibuc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    TODO:
    Scrieti o clasa java care sa returneze toate cuvintele de lungime > n dintr-un fisier text.
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    private Stream<String> getLineWords(String line) {
        List<String> words = new ArrayList<>();
        for (String word : line.split(" ")) {
            if (word.length() == 1 && !Character.isLetter(word.charAt(0))) {
                continue; // ignoram semnele de punctuatie
            }
            if (word.length() > 1) {
                if (! Character.isLetter(word.charAt(0))) { //stringul nu incepe cu o litera
                    word = word.substring(1); // elimina caracterul de la inceputul cuvantului
                }
                if (! Character.isLetter(word.charAt(word.length()-1))) { //stringul nu se termina cu o litera
                    word = word.substring(0, word.length()-1); // elimina caracterul de la sfarsitul cuvantului
                }
            }
            words.add(word);
        }
        return words.stream();
    }

    public List<String> countWordsByLength(String fileName, int minLength) {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .flatMap(this::getLineWords)
                    .filter(word -> word.length() >= minLength)
                    .collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu exista!");
        }
        catch(IOException e) {
            System.out.println("Operatie de citire esuata!");
        }
        return Collections.emptyList();
    }


    public List<String> getFilteredWords(String fileName, Predicate<String> rightLength) {
        return countWordsByLength(fileName, 1).stream()
                .filter(rightLength)
                .collect(Collectors.toList());
    }

    public List<String> getSizeOne(String fileName) {
        return getFilteredWords(fileName, word -> word.length() == 1);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return getFilteredWords(fileName, word -> word.length() < 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return getFilteredWords(fileName, word::equals);
    }

}
