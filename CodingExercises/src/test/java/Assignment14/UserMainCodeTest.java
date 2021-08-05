package Assignment14;

import org.junit.Test;

import static Assignment14.UserMainCode.validatePassword;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void validatePasswordTest() {
        String password1 = "";
        String password2 = "";
        assertTrue(validatePassword(password1));
        assertFalse(validatePassword(password2));
    }
}