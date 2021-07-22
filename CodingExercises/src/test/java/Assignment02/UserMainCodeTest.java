package Assignment02;

import org.junit.Test;

import static Assignment02.UserMainCode.addUniqueEven;
import static org.junit.Assert.assertEquals;

public class UserMainCodeTest {

    @Test
    public void addUniqueEvenTest() {
        int[] array1 = {2,5,1,4};
        int[] array2 = {1,1,1};

        assertEquals(addUniqueEven(array1), 6);
        assertEquals(addUniqueEven(array2), -1);
    }
}