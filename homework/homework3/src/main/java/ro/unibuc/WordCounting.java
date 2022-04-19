package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        System.out.println(fileWordCounter.CountOfLength("src/test/resources/poezie1.txt", length));
    }
}
