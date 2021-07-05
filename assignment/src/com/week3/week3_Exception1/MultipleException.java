import java.util.Scanner;

//main class
public class MultipleException {
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();

        try {
            String s = null;
            int c = a / b;
            System.out.println(s.length());
        } catch (NullPointerException e) {

            System.out.println("End of main due to null input");
        } catch (Exception e1) {

            System.out.println("End of main due to divide by zero");
        }
    }

}
