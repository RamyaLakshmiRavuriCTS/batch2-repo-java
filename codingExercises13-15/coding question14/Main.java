import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string/password");
        boolean isValid = UserMainCode.validatePassword(sc.next());
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
}