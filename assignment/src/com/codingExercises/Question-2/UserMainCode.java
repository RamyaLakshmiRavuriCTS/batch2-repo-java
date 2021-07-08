import java.util.*;

//logic implemented class
public class UserMainCode {

    //return the sum of unique even numbers
    public static int addUniqueEven(Integer[] arr) {
        int sum = 0;
        //removing duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(arr));
        for (Integer number : uniqueNumbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        if (sum == 0) {
            return -1;
        }
        return sum;
    }
}
