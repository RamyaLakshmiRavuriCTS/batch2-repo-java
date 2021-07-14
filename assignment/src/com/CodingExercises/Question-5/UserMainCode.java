import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class UserMainCode {
    public static int getAverageOfOdd(HashMap<Integer, Integer> key1) {
        Set<Integer> keys = key1.keySet();
        Iterator<Integer> integer2 = keys.iterator();
        int key, count = 0, sum = 0;
        while (integer2.hasNext()) {
            if ((key = integer2.next()) % 2 != 0) {
                count++;
                sum += key1.get(key);
            }
        }
        return sum / count;
    }
}
