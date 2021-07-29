import java.util.*;

public class PANvalidate {
    //Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        int result = getvalues(string1);
        if (result == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    //Returns PAN no. is valid or invalid
    public static int getvalues(String string1) {
        if (string1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
            return 1;
        } else
            return -1;
    }
}