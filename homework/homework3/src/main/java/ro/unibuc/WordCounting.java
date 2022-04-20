package ro.unibuc;

import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String fileName = "src/test/resources/poezie1.txt";
        List<String> rez = fileWordCounter.sizeLessThanN(fileName, n);
        System.out.println(rez.size());


    }
}
