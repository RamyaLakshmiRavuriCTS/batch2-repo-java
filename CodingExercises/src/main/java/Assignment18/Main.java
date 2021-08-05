package Assignment18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String panNumber = scanner.nextLine();
        int i = UserMainCode.validatePAN(panNumber);
        if (i == 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
