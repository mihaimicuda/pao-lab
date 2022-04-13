package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt(); //daca nu dam int da eroare

        System.out.println(fileWordCounter.countWordsByLength("fisier inexistent", n));
        System.out.println(fileWordCounter.countWordsByLength("src/test/resources/poezie1.txt", n));
        System.out.println(fileWordCounter.countWordsByLength("src/test/resources/poezie2.txt", n));
    }
}
