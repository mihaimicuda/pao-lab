package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.*;


/**
 TODO:
 scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
 Lungimea n trebuie introdusa de la tastatura.

 In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //Aceasta metoda imi returneaza lista cuvintelor de lungime > N
    public List<String> getSizeMoreThanN (String fileName, Integer n){

        List<String> cuvinte = new ArrayList<String>(); //lista de cuvinte ce va fi returnata

        try {
            File fisier = new File(fileName); //deschid fisierul din care se iau cuvintele
            Scanner myReader = new Scanner(fisier);
            while (myReader.hasNextLine()) { //parcurg fisierul linie cu linie
                String data = myReader.nextLine();
                String[] splitStr = data.split("[?,.!; ]"); //impart fiecare linie in cuvinte

                for (String s : splitStr) //parcurg cuvintele de pe fiecare linie
                    if (s.length() > n) //verfific lungimea fiecarui cuvant
                        cuvinte.add(s); //adaug cuvantul in lista

            }
            myReader.close(); //inchid fisierul
        }
        catch (FileNotFoundException e) { //catch pentru erori
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return cuvinte; //returnez lista de cuvinte

    }

    //Returneaza lista cuvintelor de lungime 1
    public List<String> getSizeOne(String fileName) {
        List<String> cuvinte = new ArrayList<String>();

        try {
            File fisier = new File(fileName);
            Scanner myReader = new Scanner(fisier);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitStr = data.split("\\s+");

                for(String s: splitStr)
                    if (s.length() == 1)
                        cuvinte.add(s);

            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return cuvinte;

    }

    //Returneaza lista cuvintelor de lungime mai mica decat 3
    public List<String> getSizeLessThan3(String fileName) {

        List<String> cuvinte = new ArrayList<String>();

        try {
            File fisier = new File(fileName);
            Scanner myReader = new Scanner(fisier);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitStr = data.split("\\s+");

                for(String s: splitStr)
                    if (s.length() < 3)
                        cuvinte.add(s);

            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        return cuvinte;
    }

    //Imi returneaza o lista cu toate aparitiile cuvantului dat ca parametru
    public List<String> countWordAppearances(String fileName, String word) {

        List<String> cuvinte = new ArrayList<String>();
        try {
            File fisier = new File(fileName);
            Scanner myReader = new Scanner(fisier);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitStr = data.split("\\s+");
                for(String s: splitStr){
                    if (s.equals(word))
                        cuvinte.add(word);
                    String word2 = word + "!";
                    if(s.equals(word2))
                        cuvinte.add(word);
                }
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return cuvinte;
    }
}
