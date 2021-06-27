import java.util.Scanner;

public class DefaultAndStatic implements StringOperations{

    @Override
    public String concat(String input) {
        return input.concat(" Kalpana from override method");
    }

    /*Main method
     * Default method concat method is overrides
     * but static method length cannot be override
     * those static are also called factory methods*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String input = sc.nextLine();
        DefaultAndStatic defaultAndStaticMethodsExample = new DefaultAndStatic();
        System.out.println(defaultAndStaticMethodsExample.concat(input));
        System.out.println(StringOperations.length(input));
    }

}

/*StringOperations interface have teo methods
 * concat and length
 * concat is default method and length is static method
 * from java 8 onwards dafault and static methods are included in interfaces*/
interface StringOperations {

    /*add string hello from default method to input string*/
    default String concat(String input) {
        return input.concat(" Kalpana from Default method");
    }

    /*calculate the length of string (no of characters)*/
    static int length(String input) {
        return input.length();
    }
}
