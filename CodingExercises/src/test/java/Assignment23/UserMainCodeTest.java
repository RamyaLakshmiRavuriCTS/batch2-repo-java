package Assignment23;

import org.junit.Test;

import static Assignment23.UserMainCode.convertDateFormat;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void convertDateFormatTest() {
        assertEquals("12-11-98", convertDateFormat("12/11/1998"));
        assertEquals("05-10-98", convertDateFormat("05/10/1998"));

    }
}