package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    public List<String> getWordsWithLengthGreaterThanN(String fileName, int n, String word) {
        List<String> returnList = new ArrayList<String>();
        try {
            File itemsFile = new File(fileName);
            Scanner fileReader = new Scanner(itemsFile);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] wordsOnLine = line.split(" ");
                for (String s : wordsOnLine) {
                    if(s.length() < n) {
                        returnList.add(s);
                    }
                    if(n==0) {
                        if((s.charAt(s.length()-1) == '!' && s.substring(0,s.length()-1).equals(word)) || s.equals(word)){
                            returnList.add(s);
                        }
                    }
                }
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return returnList;
    }

    public List<String> getSizeOne(String fileName) {
        return this.getWordsWithLengthGreaterThanN(fileName,2,"");
    }

    public List<String> getSizeLessThan3(String fileName) {
        return this.getWordsWithLengthGreaterThanN(fileName,3,"");
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return this.getWordsWithLengthGreaterThanN(fileName,0,word);
    }
}
