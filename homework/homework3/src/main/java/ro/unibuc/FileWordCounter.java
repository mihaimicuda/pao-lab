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

    public List<String> sizeLessThanN(String fileName, int n) {
        List<String> rezList = new ArrayList<String>();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = line.split(" ");
                for(String word : words) {
                    if(word.length() < n) {
                        rezList.add(word);
                    }
                }
            }
            fileReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        return rezList;
    }

    public List<String> countAppearances(String fileName, String word) {
        List<String> countList = new ArrayList<String>();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = line.split(" ");
                for (String i : words) {
                    if (i.equals(word) | (word+"!").equals(i)) {
                        countList.add(i);
                    }
                }
            }
            fileReader.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        return countList;
    }

    public List<String> getSizeOne(String fileName) {
        return this.sizeLessThanN(fileName, 2);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return this.sizeLessThanN(fileName, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return this.countAppearances(fileName, word);
    }
}
