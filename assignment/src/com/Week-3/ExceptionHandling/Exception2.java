package ExceptionHandling;

import java.util.Scanner;

/*Exception2 is a class that handles DivideByZero and NullPointerException
 *It throws DivideByZero Exception when divisor is zero and
 *It throws NullPointerException when string is empty*/
public class Exception2 {
    private int number1;
    private int number2;
    private String string;
    Scanner sc = new Scanner(System.in);

    private int getInt() {
        return sc.nextInt();
    }

    private String getString() {
        return sc.next();
    }

    /*Main method
     *It throws DivideByZero Exception when divisor is zero
     * and it is handled by catch block
     * When a value is not assigned to string,it throws NullPointerException when string is empty
     * and it is handled by catch block*/
    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        System.out.println("number1=");
        int number1 = obj.getInt();
        System.out.println("number2=");
        int number2 = obj.getInt();
        System.out.println("Enter String");
        String s = obj.getString();
        try {
            int result = number1 / number2;
            System.out.println("Result of division is " + result);
            if (obj.string.equals(s)) {
                System.out.println("Same");
            } else {
                System.out.println("Not Same");
            }

        } catch (ArithmeticException | NullPointerException e1) {
            System.out.println("End of main");
        }

    }
}
