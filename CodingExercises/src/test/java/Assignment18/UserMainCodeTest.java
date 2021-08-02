package Assignment18;

import org.junit.Test;

import static Assignment18.UserMainCode.validatePAN;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void validatePANTest() {
        String pan1 = "ALD3245E";
        String pan2 = "OLE124F";
        assertEquals(1, validatePAN(pan1));
        assertEquals(2, validatePAN(pan2));
    }
}