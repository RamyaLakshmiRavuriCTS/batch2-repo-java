public class UserMainCode {

    // returns true if given data is in specified format
    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*+-]).{8,}");
    }
}