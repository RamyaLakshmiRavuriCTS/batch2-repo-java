import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MasteringHashMap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of hashMap");
        int size = input.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int read = input.nextInt();
            int read1 = input.nextInt();
            map.put(read, read1);
        }
        System.out.println("The sum is: " + getAverageOfOdd(map));
    }

    public static int getAverageOfOdd(HashMap<Integer, Integer> arg1) {
        int sum = 0;
        for (Map.Entry<Integer, Integer> set :
                arg1.entrySet()) {

            if (set.getKey() % 2 != 0)
                sum += set.getValue();
        }
        return sum;
    }
}
