public abstract class Person {
    private String name;
    private String address;

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract void role();
    public abstract void responsibility();
}

class PersonMain {

    public static void main(String[]args){
        Student student = new Student("Suma","Kakinada");
        student.role();
        student.responsibility();
        Teacher teacher = new Teacher("Ayushmann","Mumbai");
        teacher.role();
        teacher.responsibility();
        Doctor doctor = new Doctor("Lakshmi","Hyderabad");
        doctor.role();
        doctor.responsibility();
    }
}