package Question14;

public class UserMainCode {


    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*+-]).{8,}");
    }
}
