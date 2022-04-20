package ro.unibuc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        FileWordCounter fileWordCounter = new FileWordCounter();

        Integer n = fileWordCounter.inputN();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String text = scanner.next();

        String[] tmpWords = text.split("[!?.,() ]");

        words.addAll(Arrays.asList(tmpWords));

        System.out.println(fileWordCounter.getSizeMoreThanN(words,n).size());

        scanner.close();
    }
}
