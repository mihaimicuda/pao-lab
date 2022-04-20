package ro.unibuc;

import java.io.FileReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FileWordCounter {

    public List<String> getWords(String fileName) {
        List<String> list = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner file = new Scanner(fileReader);

            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] words = line.split(" ");
                for (String i: words) {
                    // am sters si ’ pentru a calcula corect, dar va afisa natures, wandrest, etc. in loc de nature’s, wand’rest
                    i = i.replaceAll("[“:,;.?!”’—-]", "");
                    if (!i.chars().allMatch(Character::isDigit))  // verif. daca e cuvant
                        list.add(i);
                }
            }
            return list;

        } catch (Exception e) {
            System.out.println("Error");
        }
        return Collections.emptyList();
    }

    public List<String> findByCustomFilter(String fileName, Predicate<String> filter) {
        return getWords(fileName).stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    public List<String> getWordsMoreThanN(String fileName, int n) {
        return findByCustomFilter(fileName, word -> word.length() > n);
    }

    public List<String> getSizeOne(String fileName) {
        return findByCustomFilter(fileName, word -> word.length() == 1);
    }

    public List<String> getSizeLessThan3(String fileName) {
        return findByCustomFilter(fileName, word -> word.length() < 3);
    }

    public List<String> countWordAppearances(String fileName, String word) {
        return findByCustomFilter(fileName, w -> Objects.equals(w, word));
    }
}
