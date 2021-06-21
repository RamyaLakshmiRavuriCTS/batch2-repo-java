public class Teacher extends Person{
    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public void Role() {
        System.out.println(getName() + " is a teacher");
        System.out.println(getName() + " address is " + getAddress());
    }

    @Override
    public void Responsibilty() {

        System.out.println(getName()+ " responsibilty is teaching");
    }
}
