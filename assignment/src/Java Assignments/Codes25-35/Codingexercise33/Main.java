import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String binary=scanner.next();
        String octal=scanner.next();
        String hexadecimal=scanner.next();
        IntegerWrapperClassMethodsExample(binary,octal,hexadecimal);
    }
    public static void IntegerWrapperClassMethodsExample(String binary,String octal,String hexadecimal){

        System.out.println("The integer value of binary number "+binary+" is "+Integer.parseInt(binary,2));
        System.out.println("The integer value of octal number "+octal+" is "+Integer.parseInt(octal,8));
        System.out.println("The integer value of hexadecimal number "+hexadecimal+" is "+Integer.parseInt(hexadecimal,16));
    }
}