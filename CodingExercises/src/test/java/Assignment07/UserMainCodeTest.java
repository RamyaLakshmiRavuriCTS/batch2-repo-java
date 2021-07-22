package Assignment07;

import org.junit.Test;

import java.util.*;

import static Assignment07.UserMainCode.retirementEmployeeList;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void retirementEmployeeListTest() {
        HashMap<String, String> employees = new HashMap<>(Map.of("C1010", "02/11/1987", "C2020", "15/02/1980", "C3030", "14/12/1952", "T4040", "20/02/1950"));
        ArrayList<String> retiredList = new ArrayList<>(Arrays.asList("C3030", "T4040"));

        assertTrue((retiredList.containsAll(retirementEmployeeList(employees))));
    }
}