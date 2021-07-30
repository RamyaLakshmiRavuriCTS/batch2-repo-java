import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the pan card number:");
        String string1 = scanner.next();
        int result = UserMainCode.validatePan(string1);
        if (result == 1) {
            System.out.println("Valid Pan Number");
        } else {
            System.out.println("Invalid Pan Number");
        }
    }
}
