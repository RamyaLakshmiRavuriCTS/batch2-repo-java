import java.util.Scanner;
public class FunctionalInterface {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();                   //Enter input 1
        int b = sc.nextInt();                   //Enter input 2
        Operations sum = Integer::sum;
        Operations multiplication = (x, y) -> x * y;
        Operations subtraction = (x, y) -> x - y;
        System.out.println("Sum: " + sum.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
    }

}