package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> getWordsBasedOnCondition(String fileName, Predicate<String> myPredicate) {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            Stream<String> words = br.lines()
                    .flatMap(linie -> Stream.of(linie.split("[ ,;!?.“”]")))
                    .filter(str -> !str.equals(""))
                    .filter(myPredicate);

            return words.collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        Predicate<String> sizeOne = str -> str.length() == 1;
        return getWordsBasedOnCondition(fileName,sizeOne);
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        Predicate<String> sizeLessThan3 = str -> str.length() < 3;
        return getWordsBasedOnCondition(fileName,sizeLessThan3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        Predicate<String> isEqualToWord = str -> str.equals(word);
        return getWordsBasedOnCondition(fileName, isEqualToWord);
    }
}
