package ro.unibuc;

import java.util.HashMap;
import java.util.Map;

/**
 * O metoda care sa determine daca 2 stringuri sunt anagrame
 * car, rac -> true
 * car, cat -> false
 * car, carr -> false
 *
 * Conditie: o metoda care sa numere de cate ori apare un caracter intr-un string
 * carr: c->1 a->1 r->2
 */
public class Anagrame {

    public static void main(String[] args) {
        Anagrame anagrame = new Anagrame();
        System.out.println(anagrame.countCharacter("carr"));
        System.out.println(anagrame.countCharacter("test"));
        System.out.println(anagrame.countCharacter("ana"));

        System.out.println(anagrame.areAnagrams("car", "rac"));
        System.out.println(anagrame.areAnagrams("test", "tes"));
    }

    public boolean areAnagrams(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> str1Count = countCharacter(str1);
        Map<Character, Integer> str2Count = countCharacter(str2);

        //return str1Count == str2Count; -> will always return false, as countCharacter always creates a new map
        return str1Count.equals(str2Count);
    }

    public Map<Character, Integer> countCharacter(String str) {
        Map<Character, Integer> counter = new HashMap<>();

        //['c', 'a', 'r']
        for(char c : str.toCharArray()) {
            if(!counter.containsKey(c)) {
                counter.put(c, 1);
            } else {
                int prevValue = counter.get(c);
                counter.put(c, prevValue + 1);
            }
        }
        return counter;
    }
}
