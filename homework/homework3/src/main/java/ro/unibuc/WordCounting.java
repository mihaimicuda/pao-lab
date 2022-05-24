package ro.unibuc;

import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        Scanner in = new Scanner(System.in);
        int limit = in.nextInt();
        fileWordCounter.setLimit(limit);

        List<String> words = fileWordCounter.getWordsGreaterThanX("homework/homework3/src/test/resources/poezie2.txt");
        System.out.println(words.size());
    }
}
