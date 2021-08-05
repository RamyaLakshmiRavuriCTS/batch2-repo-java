import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int id = scanner.nextInt();
            scanner.nextLine();
            String value = scanner.nextLine();
            map.put(id, value);
        }
        System.out.println(UserMainCode.getName(map));
    }
}
