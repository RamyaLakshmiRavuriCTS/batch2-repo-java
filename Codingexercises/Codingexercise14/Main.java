package Password;

import java.util.Scanner;

//main class
public class Main {

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        boolean isValid = UserMainCode.validatePassword(sc.next());
        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("InValid");
        }
    }
}
