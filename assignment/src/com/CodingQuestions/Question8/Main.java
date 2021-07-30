import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number = scanner.nextInt();
        int result = UserMainCode.getKaprekarnumber(number);
        if (result == 1) {
            System.out.println("Kaprekar Number.");
        } else {
            System.out.println("Not a Kaprekar Number.");
        }
    }
}