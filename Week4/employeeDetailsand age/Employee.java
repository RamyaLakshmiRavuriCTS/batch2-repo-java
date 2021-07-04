public class Employee {
    private final String name;
    private final int employeeId;
    private final int age;

    public Employee(String name, int employeeId, int age) {
        this.name = name;
        this.employeeId = employeeId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
