package Assignment11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Assignment11.UserMainCode.highestScorer;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void highestScorerTest() {
        String maxScorer = "john";
        ArrayList<String> students = new ArrayList<>(Arrays.asList("sunil-56-88-23", "bindul-88-70-10", "john-70-49-65"));
        assertEquals(maxScorer, highestScorer(students));
    }
}