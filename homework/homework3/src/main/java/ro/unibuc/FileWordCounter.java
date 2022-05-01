package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FileWordCounter {

    public Integer inputN()
    {
        Scanner input_n = new Scanner(System.in);
        return input_n.nextInt();
    }

    public List<String> readFromFile(String fileName)
    {

        File file = new File(fileName);
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> wordsArray = new ArrayList<>();
        while (inputFile.hasNext())
        {
            String word  = inputFile.next().split("[!?.,()-]")[0];
            wordsArray.add(word);
        }
        return wordsArray;
    }

    public static <T> List<T> predicateFilter(List<T> list, Predicate<T> predicate) {
        List<T> temp_list = new ArrayList<>();

        for(T word : list) {
            if(predicate.test(word)==true) {
                temp_list.add(word);
            }
        }
        return temp_list;
    }

    public List<String> getSizeOne(String fileName){
        List <String> list = readFromFile(fileName);
        Predicate<String> predicate = str -> str.length() == 1;

        return predicateFilter(list , predicate);
    }

    public List<String> getSizeLessThan3(String fileName)
    {
        List <String> list = readFromFile(fileName);
        Predicate<String> predicate = str -> str.length() < 3;

        return predicateFilter(list , predicate);

    }

    public List<String> getSizeMoreThanN(String fileName)
    {
        List <String> list = readFromFile(fileName);
        Integer N = inputN();
        Predicate<String> predicate = str -> str.length() > N;
        return predicateFilter(list , predicate);
    }

    public List<String> getSizeMoreThanN(List l, Integer N)
    {
        List <String> list = l;
        Predicate<String> predicate = str -> str.length() > N;
        return predicateFilter(list , predicate);
    }

    public List<String> countWordAppearances(String fileName, String word)
    {
        List <String> list = readFromFile(fileName);
        Predicate<String> predicate = str -> str.equals(word);
        return predicateFilter(list , predicate);
    }
}
