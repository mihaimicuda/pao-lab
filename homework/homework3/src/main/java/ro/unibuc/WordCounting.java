package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int lengthLimit = scanner.nextInt();
        System.out.println(fileWordCounter.getSizeN(string, lengthLimit));

    }
}
