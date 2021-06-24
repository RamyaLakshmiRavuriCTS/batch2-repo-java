package Exceptions;

import java.util.Scanner;

/*This class Handles ArrayIndexOutOfBoundsException
 * when non-existing index of array is given to array an Exception will occurs
 * That exception is ArrayIndexOutOfBoundsException*/
public class ArrayIndexOutOfBoundsException {
    private static int[] array = new int[5];

    /*Main method
     * when non-existing index of array is given ,it throws an Exception
     * that has handled by catch block and display a message
     * otherwise it is shows result of the array elements division*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        try {
            System.out.println("enter array index of first element");
            int index1 = scanner.nextInt();
            int a = array[index1];
            System.out.println("enter array index of second element");
            int index2 = scanner.nextInt();
            int b = array[index2];
            int result = a / b;
            System.out.println(result);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("end of main");
        }
    }
}
