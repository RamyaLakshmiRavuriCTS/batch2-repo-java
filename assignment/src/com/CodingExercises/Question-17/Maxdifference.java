import java.util.Scanner;

public class Maxdifference {
    //Main method
    public static void main(String[] args) {
        int array[] = new int[20];
        int max = checkDifference(array);
        System.out.println("Difference:" + max);
    }

    //Logic Implemented class
    public static int checkDifference(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0, index = 0;
        for (int i = 0; i < size; i++) {
            int difference = Math.abs(array[i] - array[i + 1]);
            if (difference > max) {
                max = difference;
                if (array[i] > array[i + 1]) {
                    index = i;
                } else {
                    index = i + 1;
                }
            }
        }
        return index;
    }
}