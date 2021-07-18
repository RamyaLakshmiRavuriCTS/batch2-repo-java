package Assignment06;

import org.junit.Test;
import static Assignment06.UserMainCode.getAnagram;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getAnagramTest() {
        String s1 = "eleven plus two";
        String s2 = "twelve plus one";
        assertEquals(1, getAnagram(s1,s2));
        assertEquals(1, getAnagram("orchestra", "carthorse"));
        assertEquals(-1, getAnagram("hello", "world"));
    }
}