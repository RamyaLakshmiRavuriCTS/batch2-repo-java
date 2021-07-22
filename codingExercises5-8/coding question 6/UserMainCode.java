import java.util.Arrays;

public class UserMainCode {

    public static int getAnagram(String string1, String string2) {

        if (string1.length() == string2.length()) {
            //The java string replaceAll() method returns a string replacing
            // all the sequence of characters matching regex and replacement string.
                                // replaces all whitespaces with \\s
            char[] charset1 = string1.replaceAll("\\s", "").toLowerCase().toCharArray();
            char[] charset2 = string2.replaceAll("\\s", "").toLowerCase().toCharArray();

            Arrays.sort(charset1);
            Arrays.sort(charset2);

            if (Arrays.equals(charset1, charset2)) {
                return 1;
            }
        }
        return -1;
    }
}