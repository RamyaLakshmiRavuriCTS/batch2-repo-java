import java.util.HashMap;
import java.util.Scanner;

public class MasteringHashmap {
    /*Main method*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //n key value pairs using getValues() function into a hashmap
        HashMap<Integer, Integer> map = getValues(number);
        int out = UserMainCode.getAverageOfOdd(map);
        System.out.println("output:" + out);

    }

    static HashMap<Integer, Integer> getValues(int number) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> integer = new HashMap<Integer, Integer>();
        for (int i = 1; i <= number; i++) {
            int number2 = scanner.nextInt();
            int number3 = scanner.nextInt();
            integer.put(number2, number3);
        }
        return integer;
    }
}
