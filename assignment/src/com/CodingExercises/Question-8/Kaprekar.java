import java.util.*;

//main method
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

    //Logic implementation
    static class Getkaprekar {
        public static int getKaprekarnumber(int number) {
            int value = (int) Math.pow(number, 2);
            int temp = number, digit = 0;
            while (temp != 0) {
                temp = temp / 10;
                digit++;
            }
            int right = (int) (value / Math.pow(10, digit));
            int left = (int) (value % Math.pow(10, digit));
            int result = (int) (right + left);
            if (result == number) {
                return 1;
            }
            return -1;
        }
    }
}