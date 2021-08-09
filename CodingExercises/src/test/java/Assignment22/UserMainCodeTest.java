package Assignment22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static Assignment22.UserMainCode.getName;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void getNameTest() {
        HashMap<Integer, String> employeeMap = new HashMap<>(Map.of(1, "ravi5raJ", 2, "sita8gitA", 3, "ram8sitA", 4, "rahul"));
        ArrayList<String> validNames = new ArrayList<>(Arrays.asList("ravi5raJ", "sita8gitA", "ram8sitA"));

        assertEquals(validNames, getName(employeeMap));
    }
}