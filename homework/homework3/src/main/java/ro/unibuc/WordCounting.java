package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit
        Scanner scanner =  new Scanner(System.in);
        int limit = scanner.nextInt();
        String fileName = "src/test/resources/poezie1.txt";
        System.out.println("In fisierul <<" + fileName + ">> am gasit " + fileWordCounter.getSizeLessThanN(fileName,limit).size() + " cuvinte cu mai putin de " + limit + " litere");
        fileName = "src/test/resources/poezie2.txt";
        System.out.println("In fisierul <<" + fileName + ">> am gasit " + fileWordCounter.getSizeLessThanN(fileName,limit).size() + " cuvinte cu mai putin de " + limit + " litere");
    }
}
