public abstract class Person {
      String name;
     String address;
     abstract void getRole();
    abstract void getResponsibility();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}

class Student extends Person{
    String name,address;
@Override
public void getRole()
    {
        System.out.println("Role is Student");
    }
    @Override
    public void getResponsibility()
    {
        System.out.println(" Responsibility of student is learning");
    }
}

class Teacher extends Person {
    String name,address;
    @Override
    public void getRole()
    {
        System.out.println("Role is Teacher");
    }
    @Override
    public void getResponsibility()
    {
        System.out.println("Responsibility of teacher is teaching");
    }
}

class Doctor extends Person {
    String name,address;
    @Override
    public void getRole()
    {
        System.out.println("Role is Doctor");
    }
    @Override
    public void getResponsibility()
    {
        System.out.println("Responsibility of doctor is treating");
    }

}

