package Assignment01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String1: ");
        String string1 = scanner.nextLine();

        if (string1.length() > 100) {
            System.out.println("maximum of 100 characters is allowed");
            return;
        }

        System.out.println("Enter String2: ");
        String string2 = scanner.nextLine();

        if (string2.length() > 100) {
            System.out.println("maximum of 100 characters is allowed");
            return;
        }

        String replacedString = UserMainCode.replacePlus(string1, string2);
        System.out.println(replacedString);
    }
}
