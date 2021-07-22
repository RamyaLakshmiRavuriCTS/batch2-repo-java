package Assignment09;

import org.junit.Test;

import static Assignment09.UserMainCode.storeMaxVowelWord;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void storeMaxVowelWordTest() {
        storeMaxVowelWord("What is your name?");
        storeMaxVowelWord("What is your name? My name is subhash and i work in cts company");
    }
}