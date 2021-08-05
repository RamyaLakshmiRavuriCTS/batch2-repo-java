package Assignment14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserMainCode {

    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("(?=.*\\d.*)(?=.*[a-zA-Z].*)(?=.*[!@#\\$%&\\?].*).{8,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
