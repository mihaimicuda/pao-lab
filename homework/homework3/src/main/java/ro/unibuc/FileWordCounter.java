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

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular
    public List<String> smallerN(String file, int n, String word){
        List<String> l = new ArrayList<String>();
        File temp = new File(file);
        Scanner scan = null;
        try {
            scan = new Scanner(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNextLine()) {
            String[] line = scan.nextLine().split(" ");
            for (String s : line) {
                if(s.length() < n) {
                    l.add(s);
                }
                else if(word!="") {
                    if((s.charAt(s.length()-1) == '!' && s.substring(0,s.length()-1).equals(word)) || s.equals(word)){
                        l.add(s);
                    }
                }
            }
        }
        return l;
    }
    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        return this.smallerN(fileName,2,"");
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        return this.smallerN(fileName,3,"");
    }

    public List<String> countWordAppearances(String fileName, String word) {
        //TODO: add code here
        return this.smallerN(fileName,0,word);
    }
}
