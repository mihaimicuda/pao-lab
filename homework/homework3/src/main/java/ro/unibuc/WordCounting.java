package ro.unibuc;

import java.util.Scanner;

public class WordCounting {
    private static int n;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The length limit is:");
        n = scan.nextInt();
    }

    public int getN() {
        return n;
    }

}
