package ro.unibuc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindrom {

    @Test
    void testPalindrom() {
        Palindrom palindrom = new Palindrom();
        assertTrue(palindrom.isPalindrom("rar"));
        assertFalse(palindrom.isPalindrom("rat"));
    }

}
