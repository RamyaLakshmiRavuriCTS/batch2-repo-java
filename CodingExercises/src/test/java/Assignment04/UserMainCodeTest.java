package Assignment04;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static Assignment04.UserMainCode.generateOddEvenList;
import static org.junit.Assert.assertEquals;

public class UserMainCodeTest {

    @Test
    public void generateOddEvenListTest() {
        List<Integer> list1 = Arrays.asList(12, 13, 14, 15, 16);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6);
        List<Integer> result = Arrays.asList(2, 13, 4, 15, 6);

        assertEquals(generateOddEvenList(list1, list2), result);
    }
}