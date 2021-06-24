/*Teacher is subclass of Person
 * Person is abstract class
 * so,Teacher implemented unimplemented methods(role,responsibilities)*/
public class Teacher extends Person {
    private String name;
    private String address;

    public Teacher(String name, String address) {
        super(name, address);
    }

    /*implemented the unimplemented methods in Super class*/
    @Override
    public void role() {
        System.out.println(getName() + " is a Teacher");
    }

    /*implemented the unimplemented methods in Super class*/
    @Override
    public void responsibilities() {
        System.out.println(getName() + "responsibility is teaching ");
    }
}
