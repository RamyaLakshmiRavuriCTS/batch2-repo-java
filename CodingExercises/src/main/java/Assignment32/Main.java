package Assignment32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first integer");
        Integer firstInteger = scanner.nextInt();
        Integer firstAbs = Math.abs(firstInteger);

        System.out.println("Enter the second integer");
        Integer secondInteger = scanner.nextInt();
        Integer secondAbs = Math.abs(secondInteger);

        System.out.println(String.format("Absolute value of %d is %d", firstInteger, firstAbs));
        System.out.println(String.format("Absolute value of %d is %d", secondInteger, secondAbs));

        if (firstInteger == secondInteger) {
            System.out.println(firstInteger + " = " + secondInteger);
        } else {
            System.out.println(firstInteger + " !=" + secondInteger);
        }

    }
}
