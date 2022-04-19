package ro.unibuc;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) throws FileNotFoundException {
        FileWordCounter fileWordCounter = new FileWordCounter();

        System.out.println("Input the n: ");
        Scanner nr = new Scanner(System.in);
        int n = nr.nextInt();

        Scanner in = new Scanner("src/test/resources/poezie1.txt");
        List<String> result = fileWordCounter.countN(String.valueOf(in), n);

        System.out.println(result.size());

    }
}