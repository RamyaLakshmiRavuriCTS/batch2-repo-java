package Assignment16;

import org.junit.Test;

import static Assignment16.UserMainCode.findOldDate;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void findOldDateTest() {
        String date1 = "08-11-2010";
        String date2 = "05-12-1987";
        String expectedDate = "12/05/1987";
        assertEquals(expectedDate, findOldDate(date1, date2));
    }
}