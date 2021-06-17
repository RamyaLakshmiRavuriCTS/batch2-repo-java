import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindAllPairs {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter input Number");
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        printPairOfElements(list, num);
    }

    private static void printPairOfElements(List<Integer> list, int number) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (number == list.get(i) + list.get(j)) {
                    count++;
                    if (count == 1) {
                        System.out.println("The pair of elements are:");
                    }
                    System.out.println("[ " + list.get(i) + "," + list.get(j) + " ]");
                }
            }
        }
        if (count == 0) {
            System.out.println("No sum of pairs are found");
        }
    }
}
