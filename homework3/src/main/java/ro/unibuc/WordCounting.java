package ro.unibuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class WordCounting {
    public static void main(String[] args) throws IOException {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int size = Integer.parseInt(reader.readLine());

        List<String> wordsOfSizeN = fileWordCounter.getWordsOfSizeN("src/test/resources/poezie1.txt", size);
        for (String word :
                wordsOfSizeN) {
            System.out.println(word);
        }
        List<String> wordsOfSize1 = fileWordCounter.getSizeOne("src/test/resources/poezie1.txt");
        for (String word :
                wordsOfSize1) {
            System.out.println(word);
        }
        System.out.println(wordsOfSize1.size());

        List<String> wordsOfSizeLessThan3 = fileWordCounter.getSizeLessThan3("src/test/resources/poezie1.txt");
        System.out.println(wordsOfSizeLessThan3.size());

        List<String> strings = fileWordCounter.countWordAppearances("src/test/resources/poezie2.txt", "Captain");
        System.out.println(strings.size());
    }
}
