package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> getWordsOfSizeN(String fileName, int n) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        List<String> words;
        List<String> wordsOfSizeN = new ArrayList<>();
        Predicate<String> myPredicate = myString -> {return myString.length() == n;};
        while ((line = br.readLine()) != null) {
            words = Arrays.asList(line.split("[ ,;!?.\"“”]"));
            for (String word : words) {
                if (myPredicate.test(word)) wordsOfSizeN.add(word);
            }
        }
        br.close();
        fr.close();
        return wordsOfSizeN;
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        try {
            return getWordsOfSizeN(fileName, 1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        try {
            List<String> wordsOfSizeLessThan3 = new ArrayList<>();
            for (int i = 1; i < 3; i++) {
                List<String> wordsOfSizeI = getWordsOfSizeN(fileName, i);
                for (String word :
                        wordsOfSizeI) {
                    wordsOfSizeLessThan3.add(word);
                }
            }
            return wordsOfSizeLessThan3;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();
    }

    public List<String> countWordAppearances(String fileName, String word) {
        try {
            List<String> wordsOfSizeEqualToWord = getWordsOfSizeN(fileName, word.length());
            Predicate<String> myPredicate = myString -> {return myString.equals(word);};
            List<String> wordsEqualToWord = new ArrayList<>();
            for (String cuvant :
                    wordsOfSizeEqualToWord) {
                if (myPredicate.test(cuvant)) wordsEqualToWord.add(cuvant);
            }
            return wordsEqualToWord;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();
    }
}
