import java.util.HashMap;
import java.util.Scanner;
//main class
public class SumPairs {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int size = read.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++)
            arr[i] = read.nextInt();

        System.out.println("Enter the value");
        int value = read.nextInt();

        System.out.println("Pairs of elements whose sum is " + value + " are:");
        for (int i = 0; i < size; i++) {
            int rem = value - arr[i];
            if (map.containsKey(rem)) {
                int count = map.get(rem);
                for (int j = 0; j < count; j++)
                    System.out.print(rem + "+" + arr[i] + "=" + value + "\n");
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }


    }
}
