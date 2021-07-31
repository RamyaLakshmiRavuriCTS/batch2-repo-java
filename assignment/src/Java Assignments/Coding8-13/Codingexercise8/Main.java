import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = read.nextInt();
        int result = UserMainCode.getKaprkarNumber(value);
        if (result == 1)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");
    }


}
