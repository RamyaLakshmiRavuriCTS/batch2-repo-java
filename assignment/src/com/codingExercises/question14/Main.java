package question14;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = UserMainCode.validatePassword(scanner.next());
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
}
