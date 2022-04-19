package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWordCounter {

    public List<String> maiMicDecatN(String fileName, int n) throws FileNotFoundException {

        List<String> list = new ArrayList<String>();
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] words = line.split(" ");

                for (String w : words) {
                    if (w.length() <= n)
                        list.add(w);
                }
            }
            file.close();
        } catch(FileNotFoundException e){
            System.out.println("Error");
        }
        return list;
    }

    public List<String> maiMareDecatN(String fileName, int n) throws FileNotFoundException {
        List<String> list = new ArrayList<String>();

        try {
            Scanner fisier = new Scanner(new File(fileName));

            while (fisier.hasNextLine()) {
                String input = fisier.nextLine();

                String[] cuvinte = input.split(" ");

                for (String cuvant : cuvinte)
                    if (cuvant.length() > n)
                        list.add(cuvant);
            }
            fisier.close();
        } catch(FileNotFoundException e){
            System.out.println("Fisierul nu a fost gasit.");
        }
        return list;
    }

    public List<String> wordAppearances (String fileName, String word) {
        List<String> list = new ArrayList<String>();

        try {
            Scanner fisier = new Scanner(new File(fileName));
            while (fisier.hasNextLine()) {
                String input = fisier.nextLine();
                String[] cuvinte = input.split(" ");
                for (String cuvant : cuvinte)
                    if(cuvant.replace("!", "").equals(word))
                        list.add(cuvant);
            }
            fisier.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit.");
        }
        return list;
    }


    public List<String> getSizeOne(String fileName) throws FileNotFoundException {

        return this.maiMicDecatN(fileName, 1);
    }

    public List<String> getSizeLessThan3(String fileName) throws FileNotFoundException {

        return this.maiMicDecatN(fileName, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {

        return this.wordAppearances(fileName, word);
    }
}
