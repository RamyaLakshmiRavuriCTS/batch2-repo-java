/*Doctor is a subclass
 * Implementing abstract class Person */
public class Doctor extends Person {

    private String name;
    private String address;

    public Doctor(String name, String address) {
        super(name, address);
    }

    /*Implementation of abstarct method(role)*/
    @Override
    public void role() {
        System.out.println(getName() + " is a Doctor");
    }

    /*Implementation of abstarct method(responsibilities)*/
    @Override
    public void responsibilities() {
        System.out.println("Responsibility of " + getName() + " is:" +
                "\n1. Taking care of patients " +
                "\n2. Cure diseases");
    }
}
