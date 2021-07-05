import java.util.Scanner;

/*Arthwimetic is a functional interface*/
interface Arthimetic {
    /*abstract method*/
    int calculate(int x, int y);
}

/*Functional is a class which implements functional interface*/
public class Functional {
    /*Main method
     *Using functional interface sum,subtraction and multiplication are implemented using lambda expression*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter b value:");
        int b = sc.nextInt();


        Arthimetic sum = (x, y) -> a + b;
        Arthimetic s = (x, y) -> a - b;
        Arthimetic m = (x, y) -> a * b;

        int add = sum.calculate(a, b);
        int sub = s.calculate(a, b);
        int mul = m.calculate(a, b);
        System.out.println("Sum:" + add);
        System.out.println("Subtraction:" + sub);
        System.out.println("Multiplication:" + mul);
    }
}



