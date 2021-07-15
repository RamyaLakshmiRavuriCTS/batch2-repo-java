package Assignment02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i=0; i<n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenSum = UserMainCode.addUniqueEven(numbers);

        if (evenSum == -1) {
            System.out.println("no even numbers");
        } else {
            System.out.println(evenSum);
        }
    }
}
