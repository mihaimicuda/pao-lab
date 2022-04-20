package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        System.out.println("n = ");
        Scanner nr = new Scanner(System.in);
        int n = nr.nextInt();

        System.out.println(fileWordCounter.getWordsMoreThanN("src/test/resources/poezie1.txt", n));
        System.out.println(fileWordCounter.getWordsMoreThanN("src/test/resources/poezie2.txt", n));
    }
}
