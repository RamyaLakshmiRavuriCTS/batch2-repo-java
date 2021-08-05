package Assignment18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMainCode {

    public static int validatePAN(String panNumber) {
        final int VALID = 1;
        final int INVALID = 2;
        Pattern pattern = Pattern.compile("([A-Z]{3}[0-9]{4}[A-Z]{1})");
        Matcher matcher = pattern.matcher(panNumber);
        if (matcher.matches()) {
            return VALID;
        }
        return INVALID;
    }
}
