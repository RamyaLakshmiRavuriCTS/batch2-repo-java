public class UserMainCode {

    public static int validatePassword(String password){
        if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=8 )
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}