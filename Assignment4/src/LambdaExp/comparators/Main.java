package LambdaExp.comparators;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Name1", 1, 23);
        Employee emp2 = new Employee("Name2", 2, 34);
        Employee emp3 = new Employee("Name3", 3, 20);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        Collections.sort(employees, new EmployeeNameComparator());
        employees.sort(new EmployeeNameComparator());

        List<Employee> employeesSortedByName = (List<Employee>) employees.stream()
                                                                        .sorted(new EmployeeNameComparator())
                                                                        .collect(Collectors.toList());

        List<Employee> employeesSortedByAge = (List<Employee>) employees.stream()
                                                                        .sorted(new EmployeeAgeComparator())
                                                                        .collect(Collectors.toList());


        String seperator = "";
        System.out.print("Sort by name : ");
        for (Employee employee: employeesSortedByName) {
            System.out.print(seperator + employee.getName());
            seperator = ",";
        }

        seperator = "";
        System.out.print("\nSort by age : ");
        for (Employee employee:employeesSortedByAge) {
            System.out.print(seperator + employee.getName());
            seperator = ",";
        }

    }
}
