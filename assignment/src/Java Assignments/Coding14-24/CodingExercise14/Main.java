import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = validatePassword(scanner.next());
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
    // return true given data is in specified format
    public static boolean validatePassword(String password) {
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*+-]).{8,}");
    }
}