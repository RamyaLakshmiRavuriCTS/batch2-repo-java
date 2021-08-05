package Assignment15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfEmployees = Integer.parseInt(scanner.nextLine());
        HashMap<Integer, LocalDate> idMapsDOB = new HashMap<>(noOfEmployees);
        HashMap<Integer, Integer> idMapsSalary = new HashMap<>(noOfEmployees);

        for (int i = 0; i < noOfEmployees; i++) {
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate dob = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            int salary = Integer.parseInt(scanner.nextLine());

            idMapsDOB.put(id, dob);
            idMapsSalary.put(id, salary);
        }

        TreeMap<Integer, Integer> revisedSalary = UserMainCode.calculateRevisedSalary(idMapsDOB, idMapsSalary);
        revisedSalary.forEach((k, v) -> System.out.println(k + "\n" + v));
    }
}
