import java.util.Arrays;
import java.util.List;

/*GreaterThan10 is a class which presents the
 *integers greater than 10 using streams*/
public class GreaterThan10 {
    /*Main method*/
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 13, 4, 5, 29, 16, 19, 22, 6, 9, 35);
        number.stream().filter(integer -> integer > 10).forEach(System.out::println);
    }
}