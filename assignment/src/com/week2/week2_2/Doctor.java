//sub class of person
public class Doctor extends Person {

    private String name, address;

    public Doctor(String name, String address) {
        super(name, address);
    }
    //implementation for abstract method
    public void role() {
        System.out.println("My Role is Doctor");
    }
    //implementation for abstract method
    public void responsibility() {
        System.out.println("My responsibility is To treat people");
    }
}
