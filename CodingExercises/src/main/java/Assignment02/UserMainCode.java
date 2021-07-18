package Assignment02;

public class UserMainCode {

    public static int addUniqueEven(int[] numbers) {
        int sum = 0;

        for (int i: numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return (sum > 0)? sum: -1;
    }
}
