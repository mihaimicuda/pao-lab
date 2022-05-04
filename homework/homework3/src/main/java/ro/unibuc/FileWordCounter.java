package ro.unibuc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */

public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular
//    public HashMap<Integer, LinkedList<String>> separateWords(Integer min_length, String fileName) {
//        File file = new File(fileName);
//        Scanner inputFile = null;
//
//        try {
//            inputFile = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        HashMap<Integer, LinkedList<String>> map = new HashMap<>();
//
//        while(inputFile.hasNext()) {
//
//            String word = inputFile.next().split("[!?.,()-]")[0];
//
//            int length = word.length();
//
//            if (length > min_length)  {
//                if(map.get(length) != null) {
//                    LinkedList<String> stringList = map.get(length);
//                    stringList.add(word);
//                    map.put(length, stringList);
//                } else {
//                    LinkedList<String> strings = new LinkedList<>();
//                    strings.add(word);
//                    map.put(length, strings);
//                }
//            }
//
//        }
//
//        return map;
//    }

//    public List<String> getForLengthX(String fileName, int x) {
//        return separateWords(fileName).get(x);
//    }

    public List<String> getWords (List<String> wordsArray, Predicate<String> condition) {
        return wordsArray.stream().filter(condition).collect(Collectors.toList());
    }

    public List<String> getWordsWhere(String fileName, Predicate<String> condition) {
        File file = new File(fileName);
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> wordsArray = new ArrayList<>();
        while (inputFile.hasNext())
        {
            String word  = inputFile.next().split("[!?.,( )-]")[0];
            wordsArray.add(word);
        }

        return getWords(wordsArray, condition);
    }

    public List<String> getWordsMinLength(Integer minLength, String fileName) {
        return getWordsWhere(fileName, str -> str.length() >= minLength);
    }

    public List<String> getSizeOne(String fileName) {
        return getWordsWhere(fileName, str -> str.length() == 1);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return getWordsWhere(fileName, str -> str.length() < 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return getWordsWhere(fileName, str -> str.equals(word));
    }
}
