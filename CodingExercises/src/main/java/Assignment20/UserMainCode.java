package Assignment20;

import java.util.HashMap;

public class UserMainCode {

    public static String getMaxKeyValue(HashMap<Integer, String> inputMap) {
        int maxKey = 0;
        String maxKeyValue = null;
        for (Integer k : inputMap.keySet()) {
            if (k > maxKey) {
                maxKey = k;
            }

        }
        maxKeyValue = inputMap.get(maxKey);
        return maxKeyValue;
    }
}
