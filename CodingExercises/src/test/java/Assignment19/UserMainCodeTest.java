package Assignment19;

import org.junit.Test;

import static Assignment19.UserMainCode.getLastLetter;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getLastLetterTest() {
        String sentance = "This is a cat";
        String expected = "S$S$A$T";
        assertEquals(expected, getLastLetter(sentance));
    }
}