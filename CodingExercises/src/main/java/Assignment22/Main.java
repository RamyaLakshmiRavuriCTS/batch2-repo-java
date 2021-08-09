package Assignment22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        HashMap<Integer, String> employeeMap = new HashMap<>((n));

        for (int i = 0; i < (n); i++) {
            int k = Integer.parseInt(scanner.nextLine());
            String v = scanner.nextLine();
            employeeMap.put(k, v);
        }

        ArrayList<String> validNames = UserMainCode.getName(employeeMap);
        validNames.forEach(System.out::println);
    }
}
