package Assignment20;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        HashMap<Integer, String> map = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(scanner.nextLine());
            String v = scanner.nextLine();
            map.put(k, v);
        }

        String maxKeyValue = UserMainCode.getMaxKeyValue(map);
        System.out.println(maxKeyValue);
    }
}
