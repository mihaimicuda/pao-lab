package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        ro.unibuc.FileWordCounter fileWordCounter = new ro.unibuc.FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        Scanner cititor = new Scanner(System.in);
        String fileName = "homework/homework3/src/test/resources/poezie1.txt";
        int continer = cititor.nextInt();
        System.out.println(fileWordCounter.lungimeN(fileName, continer));

    }
}
