package Week3.Exceptions;

import java.util.Scanner;

public class DivideByZeroAndNullException {

    private int num1;
    private int num2;
     String string;
    Scanner scanner = new Scanner(System.in);

    private int getInt() {
        return scanner.nextInt();
    }



    public static void main(String[] args) {
        DivideByZeroAndNullException obj = new DivideByZeroAndNullException();
        System.out.println("num1=");
        int num1 = obj.getInt();
        System.out.println("num2=");
        int num2 = obj.getInt();
        try {
            int result = num1 / num2;
            System.out.println(obj.string.length());

        } catch (ArithmeticException  e1) {
            System.out.println("Airthimetic exception");
        }
          catch (NullPointerException e2){
              System.out.println("Null point exception");
          }
        System.out.println("end of main");
    }
}
