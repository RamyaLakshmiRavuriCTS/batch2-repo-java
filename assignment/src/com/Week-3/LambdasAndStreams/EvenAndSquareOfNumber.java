package LambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*EvenAndSquareOfNumber is a class which print even numbers
 *and also calculate Square of number using Functional interface and Lambdas concept*/
public class EvenAndSquareOfNumber {
    private List<Integer> list = new ArrayList<>();

    /*Main method
     *Returns even numbers in integer collections
     * and calculates square of given number and also returns it*/
    public static void main(String[] args) {
        EvenAndSquareOfNumber obj = new EvenAndSquareOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("N:");
        int num = sc.nextInt();
        System.out.println("Collections:");
        while (true) {
            if (sc.hasNextInt()) {
                obj.list.add(sc.nextInt());
            } else {
                break;
            }
        }
        System.out.print("Even numbers: ");
        SquareOfNumberAndCheckEvenOrOdd check = (number) -> {
            if (number % 2 == 0) {
                return 1;
            }
            return 0;
        };

        obj.list.stream().filter((number) -> check.squareOrCheckEvenOrOdd(number) == 1).map(integer -> integer.toString().concat(",")).forEach(System.out::print);
        //Square of given number calculation
        SquareOfNumberAndCheckEvenOrOdd s = ((number) -> num * num);
        System.out.println();
        System.out.print("Square of a number: ");
        System.out.print(s.squareOrCheckEvenOrOdd(num));
    }
}

@FunctionalInterface
/*It is a Functional Interface with a single abstract method*/
interface SquareOfNumberAndCheckEvenOrOdd {
    int squareOrCheckEvenOrOdd(int number);
}


