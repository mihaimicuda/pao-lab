package ro.unibuc;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class FileWordCounter {

    public List<String> getAllWords(String fileName){
        List<String> results = new ArrayList<String>();
        try {
            File obj = new File(fileName);
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] words = data.split("[,.;! ]+");
                results.addAll(Arrays.asList(words));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
            e.printStackTrace();
        }

        return results;
    }

    public List<String> getSizeLessThanN(String fileName, int N){
        List<String> results = new ArrayList<String>();
        List<String> words = getAllWords(fileName);
        for(String word: words) {
            if (word.length() < N) {
                results.add(word);
            }
        }
        return results;
    }

    public List<String> getSizeOne(String fileName) {
        //TODO: add code here
        return getSizeLessThanN(fileName, 2);
    }

    public List<String> getSizeLessThan3(String fileName) {
        //TODO: add code here
        return getSizeLessThanN(fileName, 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        //TODO: add code here
        List<String> results = new ArrayList<String>();
        List<String> words = getAllWords(fileName);
        for(String fileWord : words){
            if(Objects.equals(fileWord, word)){
                results.add(fileWord);
            }
        }
        return results;
    }
}
