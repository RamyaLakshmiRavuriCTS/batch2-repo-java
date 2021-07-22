package Assignment07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int noOfEmp = Integer.parseInt(scanner.nextLine());
        HashMap<String, String> employees = new HashMap<>();

        for (int i = 0; i < noOfEmp; i++) {
            String k = scanner.nextLine();
            String v = scanner.nextLine();
            employees.put(k, v);
        }

        ArrayList<String> retirementEmployeeList = UserMainCode.retirementEmployeeList(employees);
        System.out.println(retirementEmployeeList);
    }
}
