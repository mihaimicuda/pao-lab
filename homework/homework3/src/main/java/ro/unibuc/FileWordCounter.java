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

    public List<String> count(String fileName, String word, Boolean smaller, Boolean equals, int number) {
        List<String> wordsList = new ArrayList<String>();
        List<String> filteredWordsList = new ArrayList<String>();
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] wordsFromLine = scanner.nextLine().split(" ");
                for(String wordFromLine: wordsFromLine) {
                    wordsList.add(wordFromLine);
                }
            }
        } catch (FileNotFoundException e) {
            return Collections.emptyList();
        }
        if(smaller || equals) {
            for(String wordFromList: wordsList) {
                if ((smaller && wordFromList.length() < number) || (equals && wordFromList.length() == number)) {
                    filteredWordsList.add(wordFromList);
                }
            }
        } else if (word.length() > 0) {
            for (String wordFromList : wordsList) {
                if (wordFromList.replace("!", "").equals(word)) {
                    filteredWordsList.add(wordFromList);
                }
            }
        }
        return filteredWordsList;
    }

    public List<String> getSizeOne(String fileName) {
        return this.count(fileName, "",false, true, 1);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return this.count(fileName, "", true, false, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return this.count(fileName, word, false, false, 0);
    }
}
