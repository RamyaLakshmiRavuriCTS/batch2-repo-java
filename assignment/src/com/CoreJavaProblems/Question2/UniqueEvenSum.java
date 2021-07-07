import java.util.Scanner;

public class UniqueEvenSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int result = addUniqueEven(array);
        if (result == -1)
            System.out.println("NO EVEN NUMBER");
        else
            System.out.println(result);
    }

    public static int addUniqueEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                sum += array[i];
        }
        if (sum != 0)
            return sum;
        return -1;
    }
}
