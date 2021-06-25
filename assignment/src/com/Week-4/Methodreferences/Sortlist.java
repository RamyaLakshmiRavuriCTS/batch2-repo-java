import LambdasAndStreams.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sortlist {
    private final List<Employeesort> employeeList = new ArrayList<>();

    {
        employeeList.add(new Employeesort("Abhi", 1, 22));
        employeeList.add(new Employeesort("Yeswanth", 3, 23));
        employeeList.add(new Employeesort("Praveen", 2, 20));
    }

    private List<Employeesort> sortByName() {
        Comparator<Employeesort> nameComparator = Comparator.comparing(Employeesort::getName);
        return employeeList.stream().sorted(nameComparator).collect(Collectors.toList());
    }

    private List<Employeesort> sortByAge() {
        Comparator<Employeesort> ageComparator = Comparator.comparing(Employeesort::getAge);
        return employeeList.stream().sorted(ageComparator).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Sortlist example = new Sortlist();
        System.out.println("Sort by Age: ");
        example.sortByAge().stream().map(Employeesort::getName).map(String -> String.concat(",")).forEach(System.out::print);
        System.out.println();
        System.out.println("Sort by Name: ");
        example.sortByName().stream().map(Employeesort::getName).map(String -> String.concat(",")).forEach(System.out::print);
    }
}