package FunctionalInterface;

import java.util.Scanner;

/*This class implement Lambdas and Functional concept*/
public class FunctionalInterfaceExample {
    private final static Scanner sc = new Scanner(System.in);

    /*Main method
     * by using ArithmeticOperations functional interface
     * implemented the sum using method reference
     * implemented the subtract and multiplication using Lambdas expression*/
    public static void main(String[] args) {
        System.out.println("Enter input 1");
        int a = sc.nextInt();
        System.out.println("Enter input 2");
        int b = sc.nextInt();

        ArithmeticOperations sum = Integer::sum;

        ArithmeticOperations multiplication = (x, y) -> x * y;

        ArithmeticOperations subtraction = (x, y) -> x - y;

        System.out.println("Sum: " + sum.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
    }

}
