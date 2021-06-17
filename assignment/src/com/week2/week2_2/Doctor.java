public class Doctor extends Person {

    private String name, address;

    public Doctor(String name, String address) {
        super(name, address);
    }

    public void role() {
        System.out.println("My Role is Doctor");
    }

    public void responsibility() {
        System.out.println("My responsibility is To treat people");
    }
}
