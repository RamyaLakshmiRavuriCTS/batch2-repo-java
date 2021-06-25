import java.util.Scanner;
public class MultipleException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1=");
        int d = sc.nextInt();
        System.out.println("Enter num2=");
        int n = sc.nextInt();
        String s = null;

        try {
            int fraction = n / d;
            System.out.println(s.length());
        } catch (ArithmeticException |NullPointerException e) {
            System.out.println("End of Main");
        }
    }
}