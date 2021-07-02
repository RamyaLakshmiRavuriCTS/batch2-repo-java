package MethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*This class is example for method reference
 * sort the employee based on name and age
 * for comparision of employee Comparator is used
 *  */
public class MethodReferenceExample {
    private final List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("Triveni", 890826, 30));
        employeeList.add(new Employee("spandana", 890534, 33));
        employeeList.add(new Employee("Ruchita", 890933, 35));

    }

    /*sortByName returns the sorted List of employees
     * based on name of employee*/
    private List<Employee> sortByName() {
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        return employeeList.stream().sorted(nameComparator).collect(Collectors.toList());
    }

    /*sortByAge returns the sorted list of employees
     * based on age of employee*/
    private List<Employee> sortByAge() {
        Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
        return employeeList.stream().sorted(ageComparator).collect(Collectors.toList());
    }

    /*Main method
     * display the result by using streams concept */
    public static void main(String[] args) {
        MethodReferenceExample example = new MethodReferenceExample();
        System.out.println("Sort by Name: ");
        example.sortByName().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
        System.out.println();
        System.out.println("Sort by Age: ");
        example.sortByAge().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
    }
}
