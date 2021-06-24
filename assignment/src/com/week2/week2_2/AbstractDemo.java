//main class
public class AbstractDemo {
    //main method
    public static void main(String[] args) {

        Student student = new Student("Krishna", "Hyderabad");

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        student.role();
        student.responsibility();
        Teacher teacher = new Teacher("Bhaskar", "Mumbai");

        System.out.println(teacher.getName());
        System.out.println(teacher.getAddress());
        teacher.responsibility();
        teacher.role();
        Doctor doctor = new Doctor("Murthy", "Delhi");

        System.out.println(doctor.getName());
        System.out.println(doctor.getAddress());
        doctor.role();
        doctor.responsibility();
    }
}
