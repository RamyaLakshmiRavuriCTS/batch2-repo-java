/*Teacher is a subclass
 *It contains two methods(roles,responsibilities)*/
public class Teacher extends Person {

    private String name;
    private String address;

    public Teacher(String name, String address) {
        super(name, address);
    }

    /*implemented the methods in super class*/
    @Override
    public void role() {
        System.out.println(getName() + " is a Teacher");
    }

    /*implemented the methods in super class*/
    @Override
    public void responsibilities() {
        System.out.println("Responsibility of " + getName() + " is:" + "Teaching");
    }
}