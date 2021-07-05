import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//main class
public class TopSalariedEmployee {

    private final List<Employee> list = new ArrayList<>();

    {
        list.add(new Employee("CSE", 50000));
        list.add(new Employee("IT", 20000));
        list.add(new Employee("EEE", 40000));
        list.add(new Employee("CSE", 30000));
        list.add(new Employee("IT", 60000));
    }
    //main method
    public static void main(String[] args) {
        TopSalariedEmployee top = new TopSalariedEmployee();
        top.list.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}