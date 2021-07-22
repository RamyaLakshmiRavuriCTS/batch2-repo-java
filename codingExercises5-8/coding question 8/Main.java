import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = UserMainCode.getKaprekarNumber(number);
        if (result == 1) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not Kaprekar Number");
        }
    }
}