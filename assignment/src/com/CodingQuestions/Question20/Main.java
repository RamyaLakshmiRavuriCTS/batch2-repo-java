import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter size of HashMap:");
            int size = scanner.nextInt();
            Map<Integer, String> personMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                personMap.put(scanner.nextInt(), scanner.next());
            }
            System.out.println("largest key is:");
            System.out.println(UserMainCode.getMaxKeyValue(personMap));
        }
    }
