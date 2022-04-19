package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */

public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public Integer Citiren()
    {
        // citire n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        return n;
    }

    public List<String> CitireString(String fileName)
    {

        //citire file
        File file = new File(fileName);
        Scanner input = null;
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> arraycuvinte = new ArrayList<>();
        while (input.hasNext())
        {
            String word  = input.next().split("[!?.,]")[0];
            arraycuvinte.add(word);
        }
        return arraycuvinte;
    }

    /*public static void main(String[] args)
    {
        FileWordCounter obj = new FileWordCounter();
        Integer n1 = obj.Citiren();
        //List<String> list = obj.CitireString();

        Predicate<String> predicate1 = str -> str.length() == 1;
        Predicate<String> predicate3 = str -> str.length() < 3;
        Predicate<String> predicaten = str -> str.length() > n1;
    }
     */

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate,String fileName) throws FileNotFoundException {
        FileWordCounter obj = new FileWordCounter();
        List<T> newList = (List<T>) new ArrayList<>();

        for(T string : list)
        {
            if(predicate.test(string))
            {
                newList.add(string);
            }
        }
        //System.out.println(newList);
        return newList;
    }

    public List<String> getSizeOne(String fileName){
        //TODO: add code here
        List <String> list = CitireString(fileName);
        Predicate<String> predicate1 = str -> str.length() == 1;
        try
        {
            return filterList(list , predicate1 , fileName);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<String> getSizeLessThan3(String fileName)
    {
        //TODO: add code here
        List <String> list = CitireString(fileName);
        Predicate<String> predicate3 = str -> str.length() < 3;
        //System.out.println(list);
        try
        {
            return filterList(list , predicate3 , fileName);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<String> countWordAppearances(String fileName, String word)
    {
        //TODO: add code here
        List <String> list = CitireString(fileName);
        //System.out.println(list);
        Predicate<String> predicatew = str -> str.equals(word);
        try
        {
            return filterList(list , predicatew , fileName);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    public List<String> getSizeMoreThann(String fileName)
    {
        //TODO: add code here
        List <String> list = CitireString(fileName);
        Integer n = Citiren();
        Predicate<String> predicaten = str -> str.length() > n;
        //System.out.println(list);
        try
        {
            return filterList(list , predicaten , fileName);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

}
