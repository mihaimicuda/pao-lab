package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public int getSizeN(String stringSample, int n){
        String[] words = stringSample.split(" ");
        int numberOfWords = 0;
        for (String word : words)
            if (word.length() <= n)
                numberOfWords++;
        return numberOfWords;
    }

    public List<String> getSizeOne(String fileName) {
        File file = new File(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            List<String> list = new ArrayList<String>();
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words)
                    if (word.length() == 1)
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
            String line;
            List<String> list = new ArrayList<String>();
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words)
                    if (word.length() < 3)
                        list.add(word);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        File file = new File(fileName);
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            List<String> list = new ArrayList<String>();
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String wordFromText : words)
                    if (wordFromText.equals(word) | (word + "!").equals(wordFromText))
                        list.add(word);
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
