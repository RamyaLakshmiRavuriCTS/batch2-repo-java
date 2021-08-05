package Assignment08;

public class UserMainCode {

    public static int getKaprekarNumber(int number) {

        int digits = Integer.toString(number).length();
        int numSquare = (int) Math.pow(number, 2);
        int rightPart = numSquare % ((int) Math.pow(10, digits));
        int leftPart = numSquare / ((int) Math.pow(10, digits));

        if ((rightPart + leftPart) == number) {
            return 1;
        }
        return -1;
    }
}
