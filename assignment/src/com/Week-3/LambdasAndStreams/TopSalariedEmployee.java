package LambdasAndStreams;

import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/*This class prints top salaried employee from each department
 *using streams*/
public class TopSalariedEmployee {
    private List<Employee> list = new ArrayList<>();

    {
        list.add(new Employee("CSE", 10000));
        list.add(new Employee("IT", 20000));
        list.add(new Employee("EEE", 40000));
        list.add(new Employee("CSE", 30000));
        list.add(new Employee("EEE", 10000));
        list.add(new Employee("IT", 10000));
    }

    /*Main method
     *Returns top salaried employee from each department using streams*/
    public static void main(String[] args) {
        TopSalariedEmployee top = new TopSalariedEmployee();
        Collections.sort(top.list, Collections.reverseOrder());
        List<Employee> removeduplicates = new ArrayList<>(top.list);

        for (int i = 0; i < removeduplicates.size(); i++) {
            for (int j = i + 1; j < removeduplicates.size(); j++) {
                if (removeduplicates.get(i).getDepartment().equals(removeduplicates.get(j).getDepartment())) {
                    removeduplicates.remove(j);
                }
            }
        }
        removeduplicates.stream().forEach(employee -> System.out.println(employee.getDepartment() + "," + employee.getSalary()));
//        Map<String, Employee> topEmployees =
//                top.list.stream()
//                        .collect(groupingBy(
//                                Employee::getDepartment,
//                                collectingAndThen(maxBy(comparingInt(Employee::getSalary)), Optional::get)
//                        ));
    }
}
