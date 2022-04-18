package ro.unibuc;

import java.io.*;
import java.util.ArrayList;
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

    public List<String> getSizeOne(String fileName) throws FileNotFoundException {
        List<String > list = new ArrayList<>();
        Scanner scan = new Scanner(new FileInputStream(fileName));
        String line = new String();
        while (scan.hasNextLine()){
            line = scan.nextLine();
            String[] aux = line.split(" ");
            for(int i = 0; i < aux.length; i++) {
                if(aux[i].length() == 1) {
                    list.add(aux[i]);
                }
            }
        }

            return list;
    }

    public List<String> getSizeLessThan3(String fileName) throws FileNotFoundException {
        List<String > list = new ArrayList<>();
        Scanner scan = new Scanner(new FileInputStream(fileName));
        String line = new String();
        while (scan.hasNextLine()){
            line = scan.nextLine();
            String[] aux = line.split(" ");
            for(int i = 0 ; i < aux.length ; i++) {
                if (aux[i].length() < 3) {
                    list.add(aux[i]);
                }
            }
        }

        return list;
    }

    public List<String> countWordAppearances(String fileName, String word) throws FileNotFoundException {
        List<String > list = new ArrayList<>();
        Scanner scan = new Scanner(new FileInputStream(fileName));
        String line = new String();
        while (scan.hasNextLine()){
            line = scan.nextLine();
            String[] aux = line.split(" ");
            for(int i = 0 ; i < aux.length ; i++) {
                if(!Character.isLetter(aux[i].charAt(aux[i].length()-1))) {
                    aux[i] = aux[i].substring(0, aux[i].length() - 1);
                }
                if (aux[i].equals(word)) {
                    list.add(aux[i]);
                }
            }
        }
        return list;
    }
}
