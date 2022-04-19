package ro.unibuc;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) throws FileNotFoundException {
        FileWordCounter fileWordCounter = new FileWordCounter();

        Scanner input = new Scanner(System.in);

        System.out.println("Introduceti valoarea lui n: ");

        int n = input.nextInt();

        System.out.println("Cuvinte cu lungimea mai mare decat " + String.valueOf(n) + " in fisierul poezie1.txt");

        List<String> cuvinteMaiMariDecatN = fileWordCounter.maiMareDecatN("src/test/resources/poezie1.txt", n);

        System.out.println(cuvinteMaiMariDecatN.size());

        System.out.println("Cuvinte cu lungimea mai mare decat " + String.valueOf(n) + " in fisierul poezie2.txt");

        List<String> cuvinteMaiMariDecatN2 = fileWordCounter.maiMareDecatN("src/test/resources/poezie2.txt", n);

        System.out.println(cuvinteMaiMariDecatN2.size());
    }
}
