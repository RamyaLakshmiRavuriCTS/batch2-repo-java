import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Binary Number");
        String binary=scanner.next();
        System.out.println("Enter the Octal Number");
        String octal=scanner.next();
        System.out.println("Enter the Hexadecimal Number");
        String hexadecimal=scanner.next();
        UserMainCode.IntegerWrapperClassMethodsExample(binary,octal,hexadecimal);
    }
}
