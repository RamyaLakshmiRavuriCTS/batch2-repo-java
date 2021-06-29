import java.util.*;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class SalaryDetails {
    private final List<EmployeeDetails> list = new ArrayList<>();
    {
        list.add(new EmployeeDetails("CSE", 50000));
        list.add(new EmployeeDetails("IT", 20000));
        list.add(new EmployeeDetails("EEE", 40000));
        list.add(new EmployeeDetails("CSE", 30000));
        list.add(new EmployeeDetails("IT", 60000));
    }
    public static void main(String[] args) {
        salaryDetails top = new salaryDetails();
        top.list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}