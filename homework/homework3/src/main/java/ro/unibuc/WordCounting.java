package ro.unibuc;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class WordCounting {
    public static void main(String[] args) {

        FileWordCounter fileWordCounter = new FileWordCounter();

        Scanner inputFile = null;

        inputFile = new Scanner(System.in).useDelimiter("\n");

        Integer n = inputFile.nextInt();

        String[] words  = inputFile.next().split("[!?.,( )-]");

        //aici apelez metoda de filtrare

        System.out.print(fileWordCounter.getWords(Arrays.asList(words), str -> str.length() > n).size());
    }
}
