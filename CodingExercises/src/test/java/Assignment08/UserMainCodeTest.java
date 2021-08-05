package Assignment08;

import org.junit.Test;

import static Assignment08.UserMainCode.getKaprekarNumber;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getKaprekarNumberTest() {
        assertEquals(1, getKaprekarNumber(9));
        assertEquals(1, getKaprekarNumber(45));
        assertEquals(-1, getKaprekarNumber(4));
    }
}