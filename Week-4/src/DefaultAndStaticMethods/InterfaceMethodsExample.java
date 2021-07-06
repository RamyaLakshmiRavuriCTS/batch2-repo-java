package DefaultAndStaticMethods;

import java.util.Scanner;


public class InterfaceMethodsExample implements IntegerOperations {

    @Override
    public int add(int num1, int num2) {
        System.out.println("Method call from override method");
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        InterfaceMethodsExample example = new InterfaceMethodsExample();
        System.out.println(example.add(num1, num2));
        System.out.println(IntegerOperations.max(num1, num2));
    }


}
