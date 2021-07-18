package Assignment05;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;

import static Assignment05.UserMainCode.getAverageOfOdd;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getAverageOfOddTest() {
        Map<Integer,Integer> number = Map.of(2,34,1,4,5,12,4,22);
        assertEquals(8, getAverageOfOdd(number));
    }
}