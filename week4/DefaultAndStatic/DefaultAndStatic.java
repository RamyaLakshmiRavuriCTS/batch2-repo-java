import java.util.Scanner;
public class DefaultAndStatic implements StringOperations {

    @Override
    public String concat(String input) {
        return input.concat(" Hello from override method");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input");
        String input = sc.nextLine();
        DefaultAndStatic defaultAndStaticMethodsExample = new DefaultAndStatic();
        System.out.println(defaultAndStaticMethodsExample.concat(input));
        System.out.println(StringOperations.length(input));
    }
}