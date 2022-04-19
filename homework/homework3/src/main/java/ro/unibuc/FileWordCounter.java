package ro.unibuc;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

    private List<String> getWords(String fileName)
    {
        try(FileReader fin = new FileReader(fileName)){
            int chr = fin.read();
            StringBuilder sir = new StringBuilder();
            while(chr != -1) {
                sir.append((char)chr);
                chr = fin.read();
            }
            List<String> words = Arrays.asList(sir.toString().split("([^a-zA-Z’]+)’*\\1*"));
            System.out.println(words.get(0));
            return words;
        }
        catch(IOException ex)
        {
            System.out.println("File" + fileName + " doesn't exist");
        }

        return Collections.emptyList();
    }

    public int CountOfLength(String fileName, int length){
        List<String> words = getWords(fileName);
        int rez = 0;

        for(String i : words)
            if(i.length() == length)
                rez++;

        return rez;
    }

    public List<String> getSizeOne(String fileName) {
        List<String> words = getWords(fileName);
        List<String> rez = new ArrayList<>();

        for(String i : words)
            if(i.length() == 1)
                rez.add(i);

        return rez;
    }

    public List<String> getSizeLessThan3(String fileName) {
        List<String> words = getWords(fileName);
        List<String> rez = new ArrayList<>();


        for(String i : words)
            if(i.length() < 3 && i.length() > 0)
                rez.add(i);

        return rez;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        List<String> words = getWords(fileName);
        List<String> rez = new ArrayList<>();

        for(String i : words)
            if(i.equals(word))
                rez.add(i);
        return rez;
    }
}
