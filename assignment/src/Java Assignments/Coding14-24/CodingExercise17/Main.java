import java.util.Scanner;

//main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] integerArray = new int[size];
        for (int i = 0; i < size; i++) {
            integerArray[i] = scanner.nextInt();
        }
        System.out.println(findMaxDistance(integerArray, size));
    }
    //returns index of element in array whose diff b/w adjacent elements max
    public static int findMaxDistance(int[] array, int size) {
        int difference, max = 0, index = 0;
        for (int i = 0; i < size - 1; i++) {
            difference = array[i] - array[i + 1];
            if (Math.abs(difference) > max) {
                max = Math.abs(difference);
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
