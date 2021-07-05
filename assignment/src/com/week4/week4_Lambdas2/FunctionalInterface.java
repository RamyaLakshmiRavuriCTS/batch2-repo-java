import java.util.Scanner;

//functional interface
@java.lang.FunctionalInterface
interface Operation {

    public int calculate(int num1, int num2);
}

//class using functional interface
public class FunctionalInterface {


    //main method
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the 2 inputs");
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        Operation op1 = (a, b) -> a + b;
        System.out.println("Sum=" + op1.calculate(num1, num2));

        Operation op2 = (a, b) -> a * b;
        System.out.println("Multiplication=" + op2.calculate(num1, num2));

        Operation op3 = (a, b) -> a - b;
        System.out.println("Subtraction=" + op3.calculate(num1, num2));
    }
}
