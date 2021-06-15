public class AbstractDemo {
    public static void main(String[] args) {
        Student r1=new Student();
        r1.setName("Anu");
        r1.setAddress("NewDelhi");
        System.out.println("Name is :"+r1.getName());
        System.out.println("Address is : "+r1.getAddress());
        r1.getRole();
        r1.getResponsibility();
        Teacher r2=new Teacher();
        r2.setName("Abhi");
        r2.setAddress("Mumbai");
        System.out.println("Name is :"+r2.getName());
        System.out.println("Address is : "+r2.getAddress());
        r2.getRole();
        r2.getResponsibility();
        Doctor r3=new Doctor();
        r3.setName("Akki");
        r3.setAddress("Bangalore");
        System.out.println("Name is :"+r3.getName());
        System.out.println("Address is : "+r3.getAddress());
        r3.getRole();
        r3.getResponsibility();
    }
}
