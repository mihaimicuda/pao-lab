package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //citim din consola
        String text = scanner.nextLine();
        int length_limit = scanner.nextInt();
        System.out.println(FileWordCounter.getSizeN(text,length_limit));
    }
}
