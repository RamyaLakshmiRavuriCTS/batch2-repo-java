package week2.binarysearch;

import java.util.ArrayList;
import java.util.TreeSet;

public class SortElements {

    public static void main(String[] args) {
        int[] numbers = {23, 23, 46, 56, 78, 29, 90, 56, 34, 2, 78};
//        float[] floats = {23.01f, 23.01f, 46.5f, 56.9f, 78.4f, 29.2f, 90.0f, 56.5f, 34.3f, 2.9f, 78.3f};
        int N = 56;
        TreeSet sortedNumbers = new TreeSet();
        int size = numbers.length;

        for (int i = 0; i < size; i++) {
            sortedNumbers.add(numbers[i]);
        }

        System.out.println("Sorted elements : " + sortedNumbers);

        ArrayList sortedList = new ArrayList(sortedNumbers);

        int index = sortedList.indexOf(N);
        if (index == -1){
            System.out.println("Given element doesn't exists");
        } else {
            System.out.println("Element " + N + " exist at index " + index);
        }
    }
}
