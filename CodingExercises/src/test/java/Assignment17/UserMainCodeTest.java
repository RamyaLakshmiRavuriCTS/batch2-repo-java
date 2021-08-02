package Assignment17;

import org.junit.Test;

import static Assignment17.UserMainCode.findMaxDistance;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void findMaxDistanceTest() {
        int[] integers = {4, 8, 6, 1, 9, 4};
        int expextedIndex = 4;
        assertEquals(expextedIndex, findMaxDistance(integers));
    }
}