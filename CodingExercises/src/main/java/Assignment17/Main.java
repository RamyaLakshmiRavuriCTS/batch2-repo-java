package Assignment17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] integers = new int[n];

        for (int i = 0; i < n; i++) {
            integers[i] = scanner.nextInt();
        }

        int maxDistanceIndex = UserMainCode.findMaxDistance(integers);
        System.out.println(maxDistanceIndex);
    }
}
