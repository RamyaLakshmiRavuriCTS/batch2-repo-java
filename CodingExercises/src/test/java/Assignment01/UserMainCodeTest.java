package Assignment01;

import org.junit.Test;

import static Assignment01.UserMainCode.replacePlus;
import static org.junit.Assert.assertEquals;

public class UserMainCodeTest {

    @Test
    public void replacePlusTest() {
        assertEquals(replacePlus("abcxyz", "axdef"), "a++x++");
        assertEquals(replacePlus("ABCDEF", "feCBAd"), "ABCDEF");
    }
}