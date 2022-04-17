package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner =  new Scanner(System.in);
        int charNumber = scanner.nextInt();
        String fileName = "homework/homework3/src/test/resources/poezie1.txt";
        System.out.println(fileWordCounter.getWordsWithLengthGreaterThanN(fileName,charNumber,"").size());
    }
}
