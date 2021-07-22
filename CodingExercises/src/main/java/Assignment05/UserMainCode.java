package Assignment05;

import java.util.Map;

public class UserMainCode {

    public static int getAverageOfOdd(Map<Integer,Integer> numbers) {
        int count = 0;
        int sum = 0;
        int average = 0;

        for (Integer i: numbers.keySet()) {
            if (i % 2 != 0) {
                count++;
                sum += numbers.get(i);
            }
        }
        average = sum / count;
        return average;
    }
}
