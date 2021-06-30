import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {
    private final List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("Suma", 890828, 21));
        employeeList.add(new Employee("Sravani", 890827, 22));
        employeeList.add(new Employee("Ramya", 890826, 23));
    }

    private List<Employee> sortByName() {
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        return employeeList.stream().sorted(nameComparator).collect(Collectors.toList());
    }

    private List<Employee> sortByAge() {
        Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
        return employeeList.stream().sorted(ageComparator).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MethodReference example = new MethodReference();
        System.out.println("Sort by Name: ");

        example.sortByName().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
        System.out.println();
        System.out.println("Sort by Age: ");

        example.sortByAge().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
    }
}