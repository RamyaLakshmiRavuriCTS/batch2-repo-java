package Assignment15;

import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import static Assignment15.UserMainCode.calculateRevisedSalary;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void calculateRevisedSalaryTest() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        HashMap<Integer, LocalDate> idMapsDOB = new HashMap<>(Map.of(1010, LocalDate.parse("20-12-1987", dateFormat),
                2020, LocalDate.parse("01-01-1985", dateFormat)));
        HashMap<Integer, Integer> idMapsSalary = new HashMap<>(Map.of(1010, 10000, 2020, 14400));
        TreeMap<Integer, Integer> result = new TreeMap<>(Map.of(1010, 12000, 2020, 17280));

        assertEquals(result, calculateRevisedSalary(idMapsDOB, idMapsSalary));
    }
}