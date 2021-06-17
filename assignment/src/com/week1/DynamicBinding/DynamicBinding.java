import java.util.Scanner;

public class DynamicBinding {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Please Enter your choice 1:BlackAndWhiteTV  2:ColorTV");

        TV tv = null;
        if (input.equals("1:BlackAndWhiteTV")) {
            tv = new BlankAndWhite();
        } else if (input.equals("2:ColorTV")) {
            tv = new Color();
        } else {
            System.out.println("invalid selection");
            System.exit(0);
        }
        tv.print();
    }
}
