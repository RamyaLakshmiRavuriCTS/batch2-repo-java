import java.util.Arrays;
import java.util.List;

public class CheckInt {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 5, 7, 9, 12, 45, 23, 42, 16, 24);

        integerList.stream().filter(integer -> integer > 10).map((Object::toString)).map(s -> s.concat(",")).forEach(System.out::print);
    }
}