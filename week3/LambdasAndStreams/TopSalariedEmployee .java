package LambdasAndStreams;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

class TopSalariedEmployee {
    private final List<Employee> list = new ArrayList<>();
    {
        list.add(new Employee("CSE", 50000));
        list.add(new Employee("IT", 20000));
        list.add(new Employee("EEE", 40000));
        list.add(new Employee("CSE", 30000));
        list.add(new Employee("IT", 60000));
    }
    public static void main(String[] args) {
        TopSalariedEmployee top = new TopSalariedEmployee();
        top.list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}
