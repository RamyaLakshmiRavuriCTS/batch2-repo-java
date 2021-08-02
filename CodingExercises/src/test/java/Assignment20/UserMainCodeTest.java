package Assignment20;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static Assignment20.UserMainCode.getMaxKeyValue;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getMaxKeyValueTest() {
        HashMap<Integer, String> map = new HashMap<>(Map.of(12, "amron", 9, "Exide", 7, "SF"));
        String maxKeyValue = "amron";
        assertEquals(maxKeyValue, getMaxKeyValue(map));
    }
}