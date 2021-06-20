package Abs.com;

public class MainClass {

    public static void main(String[]args){

        Student student = new Student("kalpana","ongole");
        student.role();
        student.responsibility();

        Teacher teacher = new Teacher("Vinay","Hyderabad");
        teacher.role();
        teacher.responsibility();

        Doctor doctor = new Doctor("pallavi","chennai");
        doctor.role();
        doctor.responsibility();

    }
}
