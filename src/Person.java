abstract class Person {
     String name;
     String address;

     abstract void getRole();
    abstract void getResponsibility();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Student extends Person{
    String name,address;
    void getRole(){
        System.out.println("Role is Student");
    }
    void getResponsibility()
    {
        System.out.println(" Responsibility of student is learning");
    }

}

class Teacher extends Person {
    String name,address;
    void getRole(){
        System.out.println("Role is Teacher");
    }
    void getResponsibility()
    {
        System.out.println(
                " Responsibility of teacher is teaching"
        );
    }
}

class Doctor extends Person {
    String name,address;
    void getRole(){
        System.out.println("Role is Doctor");
    }
    void getResponsibility()
    {
        System.out.println(
                " Responsibility of doctor is treating"
        );
    }

}

