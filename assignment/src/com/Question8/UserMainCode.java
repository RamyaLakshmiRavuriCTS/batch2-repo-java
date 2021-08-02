package Question8;

public class UserMainCode {
    public static int getKaprekarNumber(int number) {
        int temp = number;
        int digits = 0;
        int right = 0, left = 0;
        int digit;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        int square = number * number;
        digit = (int) Math.pow(10, digits);
        right = square % digit;
        left = square / digit;
        if (number == right + left) {
            return 1;
        }
        return -1;
    }
}
