import java.util.Scanner;
//main class
public class MultipleException {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
         String s= sc.nextLine();
        try {
            int c = a / b;
            System.out.println(s.length());
        } catch (ArithmeticException | NullPointerException e) {

            System.out.println("End of main due to null input");
        }

    }

}
