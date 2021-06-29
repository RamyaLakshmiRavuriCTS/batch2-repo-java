import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {

    private static int[] array = new int[5];

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
        System.out.println("Exit");
    }
}
