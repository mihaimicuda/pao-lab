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

    public List<String> countN(String fileName, int n) throws FileNotFoundException {

     List<String> list = new ArrayList<String>();
     try {
         Scanner file = new Scanner(new File(fileName));
         while (file.hasNextLine()) {
             String line = file.nextLine();
             String words[] = line.split(" ");

             for (String w : words) {
                 if (w.length() < n)
                     list.add(w);
             }
         }
         file.close();
     } catch(FileNotFoundException e){
         System.out.println("Error");
     }
        return list;
    }


    public List<String> wordAppearances (String fileName, String word) {
        List<String> list = new ArrayList<String>();

        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine()) {
                String line = file.nextLine();
                String words[] = line.split(" ");
                for (String w : words) {
                    if(w.replace("!", "").equals(word)){
                        list.add(w);
                    }
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        return list;
    }


    public List<String> getSizeOne(String fileName) throws FileNotFoundException {

        return this.countN(fileName, 2);
    }

    public List<String> getSizeLessThan3(String fileName) throws FileNotFoundException {

        return this.countN(fileName, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {

        return this.wordAppearances(fileName, word);
    }
}
