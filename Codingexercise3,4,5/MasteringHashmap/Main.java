package MasteringHashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            numberMap.put(scanner.nextInt(), scanner.nextInt());
        }
        System.out.println(UserMainCode.getAverageOfOdd(numberMap));
    }
}