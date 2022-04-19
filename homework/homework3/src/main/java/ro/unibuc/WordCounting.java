package ro.unibuc;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) throws IOException {
        FileWordCounter fileWordCounter = new FileWordCounter();
        Scanner citire = new Scanner(System.in);
        System.out.println("Introduceti n: ");
        int size = citire.nextInt();

        List<String> resGreater = fileWordCounter.getSizeGreaterThanN("src/test/resources/poezie1.txt", size);
        List<String> resLower = fileWordCounter.getSizeLessThanN("src/test/resources/poezie1.txt", size);
        System.out.println(String.format("Cuvintele mai mari ca %d in poezie1.txt sunt: %s", size, resGreater.toString()));
        System.out.println(resGreater.size());
        System.out.println(String.format("Cuvintele mai mici ca %d in poezie1.txt sunt: %s", size, resLower.toString()));
        System.out.println(resLower.size());

        resGreater = fileWordCounter.getSizeGreaterThanN("src/test/resources/poezie2.txt", size);
        resLower = fileWordCounter.getSizeLessThanN("src/test/resources/poezie2.txt", size);
        System.out.println(String.format("Cuvintele mai mari ca %d in poezie2.txt sunt: %s", size, resGreater.toString()));
        System.out.println(resGreater.size());
        System.out.println(String.format("Cuvintele mai mici ca %d in poezie2.txt sunt: %s", size, resLower.toString()));
        System.out.println(resLower.size());
    }
}
