package Assignment33;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the binary number");
        String binary = scanner.nextLine();

        System.out.println("Enter the octal number");
        String octal = scanner.nextLine();

        System.out.println("Enter the hexadecimal number");
        String hexa = scanner.nextLine();

        System.out.println(String.format("The integer value of the binary number %s is %d", binary, Integer.valueOf(binary, 2)));
        System.out.println(String.format("The integer value of the octal number %s is %d", octal, Integer.valueOf(octal, 8)));
        System.out.println(String.format("The integer value of the hexadecimal number %s is %d", hexa, Integer.valueOf(hexa, 16)));

    }
}
