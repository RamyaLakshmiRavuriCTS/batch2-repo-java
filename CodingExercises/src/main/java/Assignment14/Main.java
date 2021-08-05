package Assignment14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (UserMainCode.validatePassword(password)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
