package Maximumdifference;

import java.util.Scanner;

//main class
public class Main {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        System.out.println("Enter the array list");
        int[] integerArray = new int[size];
        for (int i = 0; i < size; i++) {
            integerArray[i] = scanner.nextInt();
        }
        System.out.println(UserMainCode.findMaxDistance(integerArray, size));
    }
}