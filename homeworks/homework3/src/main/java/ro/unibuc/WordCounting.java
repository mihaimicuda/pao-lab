package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner =  new Scanner(System.in);
        int nr = scanner.nextInt();
        System.out.println("RESULTS");
        System.out.println("---------");
        System.out.println("Fisierul poezie1.txt are " + fileWordCounter.getSizeN("src/test/resources/poezie1.txt",nr).size() + " cuvinte cu mai putin de " + nr + " litere.");
        System.out.println("Fisierul poezie2.txt are " + fileWordCounter.getSizeN("src/test/resources/poezie2.txt",nr).size() + " cuvinte cu mai putin de " + nr + " litere.");
    }
}
