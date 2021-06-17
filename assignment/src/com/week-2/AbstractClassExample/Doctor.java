public class Doctor extends Person {
    private String name;
    private String address;

    public Doctor(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName() + " is a Doctor");
    }

    @Override
    public void responsibilities() {
        System.out.println(getName() + "responsibility is cure diseases");
    }
}
