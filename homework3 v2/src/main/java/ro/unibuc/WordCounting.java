package ro.unibuc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WordCounting {
    public static void main(String[] args) throws IOException {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String command = bufferedReader.readLine();
        List<String> commandParts = Arrays.asList(command.split(" "));
        String operator = commandParts.get(0);
        String value = commandParts.get(1);
        Predicate<String> myPredicate;
        switch (operator) {
            case "=" :
                 myPredicate = myString -> myString.length() == Integer.parseInt(value);
                 break;
            case "<" :
                myPredicate = myString -> myString.length() < Integer.parseInt(value);
                break;
            case ">" :
                myPredicate = myString -> myString.length() > Integer.parseInt(value);
                break;
            case "<=" :
                myPredicate = myString -> myString.length() <= Integer.parseInt(value);
                break;
            case ">=" :
                myPredicate = myString -> myString.length() >= Integer.parseInt(value);
                break;
            case "==" :
                myPredicate = myString -> myString.equals(value);
                break;
            default:
                myPredicate = str -> str.length() == Integer.parseInt(value);
        }

        System.out.println(fileWordCounter.getWordsBasedOnCondition("src/test/resources/poezie1.txt", myPredicate).size());

    }
}
