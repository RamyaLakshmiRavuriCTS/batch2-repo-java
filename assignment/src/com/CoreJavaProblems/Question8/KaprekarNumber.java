import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the value");
        int value = read.nextInt();
        int result = getKaprkarNumber(value);
        if (result == 1)
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");
    }

    public static int getKaprkarNumber(int value) {
        int square = value * value;
        int size = String.valueOf(square).length();
        int divisor = 10;
        for (int i = 1; i < (size / 2); i++)
            divisor = divisor * 10;
        int left = square / divisor;
        int right = square % divisor;
        if ((left + right) == value)
            return 1;
        else
            return -1;

    }
}
