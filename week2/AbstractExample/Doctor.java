public class Doctor extends Person{
    public Doctor(String name, String address) {
        super(name, address);
    }

    @Override
    public void Role() {
        System.out.println(getName() + " is a doctor");
        System.out.println(getName() + " address is " + getAddress());
    }

    @Override
    public void Responsibilty() {
        System.out.println(getName() + " responsibility is treating");
    }
}
