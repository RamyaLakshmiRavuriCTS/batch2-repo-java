package LambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*This class print even numbers in a collection of integers
 * and also calculate square of a number
 * By using FunctionalInterface and Lambdas concept*/
public class PrintEvenNumbersAndSquareOfNumber {
    private final List<Integer> list = new ArrayList<>();

    /*Main method
     * return even numbers from a collections of interger
     * and also calculate square of given number
     * By using Functional interface SquareOfNumbersAndCheckEvenOrOdd interface
     * and return even numbers and square of given number */
    public static void main(String[] args) {
        PrintEvenNumbersAndSquareOfNumber obj = new PrintEvenNumbersAndSquareOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter the collections");
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
        //Checking even or odd
        obj.list.stream().filter((number) -> check.squareOrCheckEvenOrOdd(number) == 1).map(integer -> integer.toString().concat(",")).forEach(System.out::print);
        //calculating Square of a number
        SquareOfNumberAndCheckEvenOrOdd square = ((number) -> num * num);
        System.out.println();
        System.out.print("Square of a number: ");
        System.out.print(square.squareOrCheckEvenOrOdd(num));
    }
}
