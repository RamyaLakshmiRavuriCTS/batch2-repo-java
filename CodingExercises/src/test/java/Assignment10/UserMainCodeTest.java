package Assignment10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static Assignment10.UserMainCode.performSetOperations;
import static org.junit.Assert.*;

public class UserMainCodeTest {

    @Test
    public void performSetOperationsTest() {
        ArrayList<Integer> setA = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> setB = new ArrayList<>(Arrays.asList(3, 5, 7));
        ArrayList<Integer> resultA = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 7));


        ArrayList<Integer> setC = new ArrayList<>(Arrays.asList(10, 9, 8, 7));
        ArrayList<Integer> setD = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        ArrayList<Integer> resultC = new ArrayList<>(Arrays.asList(8));


        ArrayList<Integer> setE = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        ArrayList<Integer> setF = new ArrayList<>(Arrays.asList(0, 10, 12, 20));
        ArrayList<Integer> resultE = new ArrayList<>(Arrays.asList(5, 15));

        assertTrue(resultA.containsAll(performSetOperations(setA, setB, '+')));
        assertTrue(resultC.containsAll(performSetOperations(setC, setD, '*')));
        assertTrue(resultE.containsAll(performSetOperations(setE, setF, '-')));
    }
}