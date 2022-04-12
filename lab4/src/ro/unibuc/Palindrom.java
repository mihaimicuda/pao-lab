package ro.unibuc;

import java.util.Arrays;
import java.util.List;

/**
    O metoda care sa determine daca un string este palindrom

 */
public class Palindrom {

    public boolean isPalindrom(String str) {
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }

        return true;
//        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
