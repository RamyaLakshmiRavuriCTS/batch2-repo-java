package FunctionalInterface;

/*ArithmeticOperations is Functional interface
because it contains only one abstract method calculate() */
@FunctionalInterface
public interface ArithmeticOperations {
    /*Abstract method*/
    int calculate(int a, int b);
}
