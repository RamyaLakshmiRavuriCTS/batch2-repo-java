public class UserMainCode {
    public static int validatePan(String string1) {
        if (string1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
            return 1;
        } else
            return -1;
    }
}


