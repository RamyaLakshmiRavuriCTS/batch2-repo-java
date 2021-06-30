package LambdaExp.comparators;

public class Employee {

    private String name;
    private int empId;
    private int age;

    public Employee(String name, int empId, int age) {
        this.name = name;
        this.empId = empId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmpId() {
        return empId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", age=" + age +
                '}';
    }
}
