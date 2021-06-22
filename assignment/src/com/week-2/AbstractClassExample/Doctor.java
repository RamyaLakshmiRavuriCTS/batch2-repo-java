/*Doctor class is sub class of Person class
 *implementing abstract class Person*/
public class Doctor extends Person {
    private String name;
    private String address;

    public Doctor(String name, String address) {
        super(name, address);
    }

    /*implementaion of abstract method role*/
    @Override
    public void role() {
        System.out.println(getName() + " is a Doctor");
    }

    /*implementaion of abstract method role*/
    @Override
    public void responsibilities() {
        System.out.println(getName() + "responsibility is cure diseases");
    }
}
