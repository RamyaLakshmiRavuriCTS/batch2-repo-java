package Assignment25;

import org.junit.Test;

import static Assignment25.UserMainCode.getAge;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getAgeTest() {
        assertEquals("eligible", getAge("16/11/1991"));
        assertEquals("not-eligible", getAge("16/11/2012"));
    }
}