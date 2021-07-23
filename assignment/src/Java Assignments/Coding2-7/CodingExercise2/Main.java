import java.util.*;
import java.util.Scanner;

//main class
public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        int size = SCANNER.nextInt();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = SCANNER.nextInt();
        }

        //calling static method
        int result = addUniqueEven(arr);
        if (result == -1) {
            System.out.println("no even numbers");
        } else {
            System.out.println(result);
        }
    }

        //return the sum of unique even numbers
        public static  int addUniqueEven(Integer[] arr) {
        int sum = 0;
        //removing duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(arr));
        for (Integer number : uniqueNumbers) {
            if (number % 2 == 0) {
                sum = sum + number;
            }
        }
        if (sum == 0) {
            return -1;
        }
        return sum;
    }

}
