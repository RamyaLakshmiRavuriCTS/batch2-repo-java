import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        String binary= sc.next();

        System.out.println("Enter the Octal Number");
        String octal= sc.next();

        System.out.println("Enter the Hexadecimal Number");
        String hexadecimal= sc.next();

        UserMainCode.IntegerWrapperClassMethodsExample(binary,octal,hexadecimal);
    }

}