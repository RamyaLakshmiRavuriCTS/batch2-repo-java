package Assignment08;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        UserMainCode.getKaprekarNumber(number);

        if (UserMainCode.getKaprekarNumber(number) == 1) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not A Kaprekar Number");
        }
    }
}
