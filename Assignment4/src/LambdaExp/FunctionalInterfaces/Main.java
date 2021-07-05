package LambdaExp.FunctionalInterfaces;

public class Main {

    public static void main(String[] args) {

        int a = 8;
        int b = 5;

        MyFunctionalInterface addition = ((num1, num2) -> (num1+num2));
        MyFunctionalInterface subtraction = ((num1, num2) -> (num1-num2));
        MyFunctionalInterface multiplication = ((num1, num2) -> (num1*num2));

        System.out.println("Sum : " + addition.calculate(a,b));
        System.out.println("Multiplication : " + multiplication.calculate(a,b));
        System.out.println("Subtraction : " + subtraction.calculate(a,b));
    }
}
