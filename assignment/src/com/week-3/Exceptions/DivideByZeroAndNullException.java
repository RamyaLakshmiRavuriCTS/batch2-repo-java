package Exceptions;

import java.util.Scanner;

/*This class handles Arithmetic and NullPointerException
 * if divisor is equal to zero then it throws ArithmeticException
 * if string value is null and try to perform an operation on string
 * then it throws NullPointerException*/
public class DivideByZeroAndNullException {
    private String string;
    Scanner scanner = new Scanner(System.in);

    /*return integer as output*/
    private int getInt() {
        return scanner.nextInt();
    }

    /*return string as output*/
    private String getString() {
        return scanner.next();
    }

    /*Main method
     * takes two integers from user and perform division operation on those two integers
     * if the divisor is division is equal to zero then it throws ArithmeticException
     * and handled by catch block and displays a message
     * And in this class declared a instant string variable and not assign value to string
     * and try to perform equals operations on that string then it throws NullPointerException
     * and handled by same catch block and displays a message
     * Catch block handles both Arithmetic and NullPointer Exception */
    public static void main(String[] args) {
        DivideByZeroAndNullException obj = new DivideByZeroAndNullException();
        System.out.println("num1=");
        int num1 = obj.getInt();
        System.out.println("num2=");
        int num2 = obj.getInt();
        System.out.println("enter string");
        String s = obj.getString();
        try {
            int result = num1 / num2;
            System.out.println("result of division is " + result);
            if (obj.string.equals(s)) {
                System.out.println("same");
            } else {
                System.out.println("not same");
            }

        } catch (ArithmeticException | NullPointerException e1) {
            System.out.println("End of main");
        }

    }
}
