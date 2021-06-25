package src.exceptions;

import java.util.Scanner;

public class ZeroAndNullException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("num1=");
        int num1 = scanner.nextInt();

        System.out.println("num2=");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        String text = "null";
        int lenghtOfText;

        double quotient;
        try {
            quotient =  num1 / num2;
            System.out.println("num1 / num2 = " + quotient);

            lenghtOfText = text.length();
            System.out.println("Length of String: " + lenghtOfText);

            System.out.println("End of main");
        } catch (ArithmeticException e) {
            System.out.println("End of main");

        } catch (NullPointerException e) {
            System.out.println("End of main");
        } finally {
            scanner.close();
        }

    }
}
