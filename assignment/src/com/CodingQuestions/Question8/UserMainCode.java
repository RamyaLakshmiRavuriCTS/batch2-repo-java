public class UserMainCode {

        public static int getKaprekarnumber(int number) {
            int lefthandside = 0;
            int digit = 0, square, rightHandSide = 0;
            square = number * number;
            lefthandside= square;

            while (square > 0) {
                digit++;
                square = square / 10;
            }

            int number1 = (int) Math.pow(10, (digit / 2));
            while (lefthandside> 0) {
                rightHandSide = rightHandSide + (lefthandside % number1);
                lefthandside= lefthandside / number1;
            }

            if (number==rightHandSide) {
                return 1;
            } else {
                return -1;
            }
        }
}
