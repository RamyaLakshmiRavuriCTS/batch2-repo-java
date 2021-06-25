package src.lambdas.first;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee("CSE", 20000);
        Employee emp2 = new Employee("CSE", 30000);
        Employee emp3 = new Employee("IT", 20000);
        Employee emp4 = new Employee("EEE", 40000);
        Employee emp5 = new Employee("IT", 10000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        Map<String, Employee> stringListMap =
                employees.stream()
                        .collect(Collectors.toMap(
                                e -> e.getDepartment(),
                                e -> e,
                                BinaryOperator.maxBy(Comparator.comparingDouble(e -> e.getSalary()))
                        ));

        for (Employee employee: stringListMap.values()) {
            System.out.println(employee);
        }
    }
}
