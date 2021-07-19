import java.util.*;

//Main class
public class Kaprekar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();

        int result = Getkaprekar.getKaprekarnumber(number);
        if (result == 1) {
            System.out.println("Kaprekar Number.");
        } else {
            System.out.println("Not a Kaprekar Number.");
        }
    }

    //Logic implementation class
    static class Getkaprekar {
        public static int getKaprekarnumber(int number) {
            int left = 0;
            int digit = 0, square, right = 0;
            square = number * number;
            left = square;

            while (square > 0) {
                digit++;
                square = square / 10;
            }

            int number1 = (int) Math.pow(10, (digit / 2));
            while (left > 0) {
                right = right + (left % number1);
                left = left / number1;
            }

            if (number==right) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}