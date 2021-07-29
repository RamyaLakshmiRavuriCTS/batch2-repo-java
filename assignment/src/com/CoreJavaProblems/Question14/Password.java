import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Enter the password");
        String password1=read.nextLine();

        boolean validPassword = validatePassword(password1);
        if(validPassword)
            System.out.println("The password is valid");
        else
            System.out.println("The password doesntmatch the requirements");
    }
    public static boolean validatePassword(String password)
    {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
