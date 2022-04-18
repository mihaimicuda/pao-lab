package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        String file = "homework/homework3/src/test/resources/poezie1.txt";
        System.out.println(fileWordCounter.smallerN(file,n,"").size());


    }
}
