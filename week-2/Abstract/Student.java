public class Student extends Person{

    public Student(String name,String address){
        super(name,address);
    }

    @Override
    public void role() {
        System.out.println(getName()+" is Student");
    }

    @Override
    public void responsibility() {
        System.out.println(getName()+" goes to school");
        System.out.println(getName()+" lives in "+getAddress());
    }
}