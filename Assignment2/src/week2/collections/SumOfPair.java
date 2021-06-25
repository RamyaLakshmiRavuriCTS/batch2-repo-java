package week2.collections;

import java.util.Scanner;

public class SumOfPair {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Size of Array");

        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Input Array: ");

        for (int i = 0; i < size; i++) {
            int n = scanner.nextInt();
            inputArray[i] = n;
        }

        System.out.println("Input Number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = (i + 1); j < size; j++) {
                int sum = inputArray[i] + inputArray[j];
                if (sum == number) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + sum);
                }
            }
        }

        scanner.close();
    }
}
