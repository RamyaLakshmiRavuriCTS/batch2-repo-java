package question14;

//Logic implemented class
public class UserMainCode {

    // return true given data is in specified format
    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*+-]).{8,}");
    }
}
