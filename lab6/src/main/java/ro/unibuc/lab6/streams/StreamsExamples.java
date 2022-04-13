package ro.unibuc.lab6.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {

        List<String> randomStrings = Arrays.asList("bala", "ala", "portocala", "243", "244", "235", "ala", "244");

        List<String> v2Strings = randomStrings.stream()
                .map(s -> s + "_v2")
                .collect(Collectors.toList());

        System.out.println(v2Strings);

        List<String> numericStrings = randomStrings.stream()
                .filter(str -> {
                    try {
                        Integer.parseInt(str);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());

        System.out.println(numericStrings);

        List<String> sortedStrings = randomStrings.stream()
                .sorted((str1, str2) -> str1.compareTo(str2))
                .collect(Collectors.toList());

        System.out.println(sortedStrings);

        List<Integer> chainingStrings = randomStrings.stream()
                .distinct()
                .filter(str -> {
                    try {
                        Integer.parseInt(str);
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                })
                .map(str -> Integer.parseInt(str))
                .sorted((gr1, gr2) -> gr2 - gr1)
                .collect(Collectors.toList());
        System.out.println(chainingStrings);
    }
}
