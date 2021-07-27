package Assignment14;

import org.junit.Test;

import static Assignment14.UserMainCode.validatePassword;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void validatePasswordTest() {
        String password1 = "hello@1010";
        String password2 = "punitha3";
        assertTrue(validatePassword(password1));
        assertFalse(validatePassword(password2));
    }
}