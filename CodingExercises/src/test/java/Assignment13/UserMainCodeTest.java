package Assignment13;

import org.junit.Test;

import static Assignment13.UserMainCode.swapPairs;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void swapPairsTest() {
        String swappedWord1 = "ofgrte";
        String swappedWord2 = "eN woYkr";
        String inputWord1 = "forget";
        String inputWord2 = "New York";
        assertEquals(swappedWord1, swapPairs(inputWord1));
        assertEquals(swappedWord2, swapPairs(inputWord2));
    }
}