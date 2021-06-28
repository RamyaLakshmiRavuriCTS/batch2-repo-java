import java.util.Scanner;
public class FunctionalInterface {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input 1");
        int a = sc.nextInt();
        System.out.println("Enter input 2");
        int b = sc.nextInt();

        Operations sum = Integer::sum;

        Operations multiplication = (x, y) -> x * y;

        Operations subtraction = (x, y) -> x - y;

        System.out.println("Sum: " + sum.calculate(a, b));
        System.out.println("Multiplication: " + multiplication.calculate(a, b));
        System.out.println("Subtraction: " + subtraction.calculate(a, b));
    }

}