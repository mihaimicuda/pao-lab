package ro.unibuc;

import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner =  new Scanner(System.in);
        int nr = scanner.nextInt();
        List<String> result = fileWordCounter.numaraN("homework/homework3/src/test/resources/poezie1.txt",nr);
        System.out.println(result.size());
    }
}
