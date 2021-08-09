package Assignment21;

import org.junit.Test;

import static Assignment21.UserMainCode.getDay;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getDayTest() {
        String date1 = "07-13-2012";
        String date2 = "07-16-2021";
        String expectedDay = "Friday";
        assertEquals(expectedDay, getDay(date1));
        assertEquals(expectedDay, getDay(date2));
    }
}