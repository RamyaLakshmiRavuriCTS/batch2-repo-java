public class Teacher extends Person{

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public void role() {
        System.out.println(getName()+" is Teacher");
    }

    @Override
    public void responsibility() {
        System.out.println(getName()+" works as a Teacher");
        System.out.println(getName()+" lives in "+getAddress());
    }
}