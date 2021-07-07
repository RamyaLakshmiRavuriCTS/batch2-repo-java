package DefaultAndStaticMethods;

import java.util.Scanner;

/*This class implements StringOperations
 * Default methods can be overriden
 * and static methods cannot be override */
public class DefaultAndStaticMethodsExample implements StringOperations {

    @Override
    public String concat(String input) {
        return input.concat(" Hello from override method");
    }

    /*Main method
     * Default method concat method is overriden
     * but static method length cannot be override
     * those static are also called factory methods*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String input = sc.nextLine();
        DefaultAndStaticMethodsExample defaultAndStaticMethodsExample = new DefaultAndStaticMethodsExample();
        System.out.println(defaultAndStaticMethodsExample.concat(input));
        System.out.println(StringOperations.length(input));
    }


}
