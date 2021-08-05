package Assignment12;

import org.junit.Test;

import static Assignment12.UserMainCode.getWordWithMaximumVowels;
import static org.junit.Assert.assertEquals;

public class UserMainCodeTest {

    @Test
    public void storeMaxVowelWordTest() {
        String word = "Appreciation";
        assertEquals(word, getWordWithMaximumVowels("Appreciation is the best way to motivate"));
    }
}