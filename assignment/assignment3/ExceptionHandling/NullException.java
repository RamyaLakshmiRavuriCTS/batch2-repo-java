import java.util.Scanner;

public class NullException {
    private int num1;
    private int num2;
    private String string;
    Scanner sc = new Scanner(System.in);

    private int getInt() {
        return sc.nextInt();
    }

    private String getString() {
       return sc.next();
    }

    public static void main(String[] args) {
        NullException obj = new NullException();
        System.out.println("num1=");
        int num1 = obj.getInt();
        System.out.println("num2=");
        int num2 = obj.getInt();
        System.out.println("enter string");
        String s = obj.getString();

        try {
            int result = num1 / num2;
            if (obj.string.equals(s)) {
                System.out.println("same");
            } else {
                System.out.println("not same");
            }
        } catch (ArithmeticException | NullPointerException e1) {
            System.out.println("End of main");
        }
    }
}
