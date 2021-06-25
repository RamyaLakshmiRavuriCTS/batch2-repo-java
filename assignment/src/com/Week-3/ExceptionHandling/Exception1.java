package ExceptionHandling;

import java.util.Scanner;

/*Exception1 class handles ArrayIndexOutOfBoundsException
 *It occurs when the index of array given doest not exists*/
public class Exception1 {
    private static int[] array = new int[5];

    /*Main method
     *It throws an exception when array index does not exists
     * that is handled by catch block*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        try {
            System.out.println("enter array index of first element");
            int index1 = sc.nextInt();
            int a = array[index1];
            System.out.println("enter array index of second element");
            int index2 = sc.nextInt();
            int b = array[index2];
            int Result = a / b;
            System.out.println(Result);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("end of main");
        }
    }
}
