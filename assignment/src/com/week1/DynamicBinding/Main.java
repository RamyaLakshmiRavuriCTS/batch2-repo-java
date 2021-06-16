import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Please Enter your choice 1:BlackAndWhiteTV  2:ColorTV");

        TV tv = input.toLowerCase().contains("b") ? new BlankAndWhite() : new Color();
        tv.print();
    }
}
