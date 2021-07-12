import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Methodreference {
    private final List<Employee> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employee("Sravani", 890827, 21));
        employeeList.add(new Employee("Ramyasri", 890826, 24));
        employeeList.add(new Employee("Bhargavi", 890828, 23));
        employeeList.add(new Employee("Anu", 890824, 22));

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
        Methodreference example = new Methodreference();
        System.out.println("Sort by Name: ");

        example.sortByName().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
        System.out.println();
        System.out.println("Sort by Age: ");
        example.sortByAge().stream().map(Employee::getName).map(String -> String.concat(",")).forEach(System.out::print);
    }
}