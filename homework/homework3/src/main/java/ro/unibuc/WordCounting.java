package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Length limit:  ");
        int number = scanner.nextInt();
        int smallerLimit = fileWordCounter.count("homework/homework3/src/test/resources/poezie1.txt", "", true, false, number).size();
        int equalsLimit = fileWordCounter.count("homework/homework3/src/test/resources/poezie1.txt", "", false, true, number).size();
        System.out.println("Words with length smaller than " + number + ": " + smallerLimit);
        System.out.println("Words with length equals with " + number + ": " + equalsLimit);
    }
}
