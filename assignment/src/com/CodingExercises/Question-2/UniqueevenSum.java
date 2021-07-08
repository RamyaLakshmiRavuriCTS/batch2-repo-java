import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/*Main method*/
public class UniqueevenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int size = scanner.nextInt();

        System.out.println("Enter Input Array:");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Sum=" + uniqueSumofEvennos(array));
    }

    /*This class is used to remove duplicate numbers,
     *print and return the sum of even numbers in given input array*/
    public static int uniqueSumofEvennos(int[] array) {
        int sum = 0;

        LinkedHashSet<Integer> number = new LinkedHashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            number.add(array[i]);
        }

        Iterator<Integer> even = number.iterator();
        while (even.hasNext()) {
            int number2 = even.next();
            if (number2 % 2 == 0)
                sum = sum + number2;
        }

        if (sum == 0)
            System.out.println("No even numbers");

        return sum;
    }
}