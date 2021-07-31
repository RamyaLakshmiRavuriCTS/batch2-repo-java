public class UserMainCode {
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
