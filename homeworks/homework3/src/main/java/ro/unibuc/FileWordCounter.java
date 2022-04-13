package ro.unibuc;

import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;



public class FileWordCounter {


    public List<String> getSizeN(String fileName, int n) {
        List<String> list = new ArrayList<>();
        try {
            File obj = new File(fileName);
            Scanner reader = new Scanner(obj);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] words = line.split(" ");
                for (String str : words) {
                    if(str.length() < n) {
                        list.add(str);
                    }
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error! File has not been found.");
        }
        return list;
    }

    public List<String> getWords(String fileName){
        List<String> results = new ArrayList<>();
        try {
            File obj = new File(fileName);
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] words = data.split("[,.;! ]+");
                results.addAll(Arrays.asList(words));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! File has not been found.");
            e.printStackTrace();
        }

        return results;
    }

    public List<String> getSizeOne(String fileName) {
        return getSizeN(fileName, 2);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return getSizeN(fileName, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        List<String> wordappearances = new ArrayList<>();
        List<String> words = getWords(fileName);
        for (String countwords : words) {
            if (countwords.equals(word) | (word + "!").equals(countwords))
                wordappearances.add(word);
    }
        return wordappearances;
    }
}
