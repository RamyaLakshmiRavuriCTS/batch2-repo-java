/*Student is subclass of Person
 * Person is abstract class
 * so,student implemented unimplemented methods(role,responsibilities)*/
public class Student extends Person {
    private String name;
    private String address;

    public Student(String name, String address) {
        super(name, address);
    }

    /*implemented abstract methods */
    @Override
    public void role() {
        System.out.println(getName() + " is a Student");
    }

    /*implemented abstract methods */
    @Override
    public void responsibilities() {
        System.out.println(getName() + " responsibility is complete assignments ontime");
    }
}
