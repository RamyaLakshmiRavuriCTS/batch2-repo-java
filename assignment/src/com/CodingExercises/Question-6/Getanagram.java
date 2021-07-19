import java.util.Arrays;

public class Getanagram {
    public static int getanagram(String string1, String string2) {

        if (string1.length() == string2.length()) {

            // convert strings to char array
            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);
            if (result) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
