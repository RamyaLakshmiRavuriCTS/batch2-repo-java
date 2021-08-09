package Assignment24;

import org.junit.Test;

import static Assignment24.UserMainCode.getLastDayOfMonth;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getLastDayOfMonthTest() {
        assertEquals(30, getLastDayOfMonth("12-06-2012"));
        assertEquals(29, getLastDayOfMonth("10-02-2012"));
    }
}