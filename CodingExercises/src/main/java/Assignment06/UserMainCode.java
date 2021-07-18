package Assignment06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {

    public static int getAnagram(String string1, String string2) {
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String s1 = new String(chars1);
        String s2 = new String(chars2);

        if (s1.equals(s2)) {
            return 1;
        }
        return -1;
    }
}
