package src.lambdas.second;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        Integer[] integerArray = {2, 45, 67, 33, 24, 88, 94, 356, 77, 12};
        int n = 5;

        List<Integer> integerList = Arrays.asList(integerArray);
        List<Integer> evenNumbers = integerList.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers.toString());

        NumberSquare numberSquare = (int number) -> (number * number);
        System.out.println("Square of a number: " + numberSquare.getSquare(n));

    }

}
