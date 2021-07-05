/*Employeesort class is a pojo
 *used to store info
 */
public class Employeesort {

    private int Empid;
    public String name;
    private int age;

    public Employeesort(String name, int Empid, int age) {
        this.name = name;
        this.Empid = Empid;
        this.age = age;
    }

    public int getId() {
        return Empid;
    }

    public void setId(int id) {
        this.Empid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}