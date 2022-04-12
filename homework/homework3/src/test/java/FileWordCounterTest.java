import org.junit.jupiter.api.Test;
import ro.unibuc.FileWordCounter;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileWordCounterTest {

    FileWordCounter counter = new FileWordCounter();

    @Test
    void testWordCountSize1() throws FileNotFoundException {
        List<String> strings = counter.getSizeOne("src/test/resources/poezie1.txt");

        assertEquals(5, strings.size());
    }

    @Test
    void testWordCountSizeLessThan3() throws FileNotFoundException {
        List<String> strings = counter.getSizeLessThan3("src/test/resources/poezie1.txt" );

        assertEquals(23, strings.size());
    }

    @Test
    void testWordCountCaptain() throws FileNotFoundException {
        //atentie la cele care contin si un "!" dupa Captain
        List<String> strings = counter.countWordAppearances("src/test/resources/poezie2.txt", "Captain");

        assertEquals(7, strings.size());
    }
}
