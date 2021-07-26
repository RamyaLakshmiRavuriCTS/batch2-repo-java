import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Map<String, String> employeeMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            employeeMap.put(sc.next(), sc.next());
        }
        System.out.println(UserMainCode.retirementEmployeeList(employeeMap));

    }
}