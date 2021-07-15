package Assignment03;

import org.junit.Test;

import static Assignment03.UserMainCode.countNoOfWords;
import static org.junit.Assert.assertEquals;

public class UserMainCodeTest {

    @Test
    public void countNoOfWordsTest() {
        assertEquals(countNoOfWords("abc bcd abc bcd abc abc", "av abc"),4);
        assertEquals(countNoOfWords("ABC xyz AAA", "w abc"),0);
    }
}