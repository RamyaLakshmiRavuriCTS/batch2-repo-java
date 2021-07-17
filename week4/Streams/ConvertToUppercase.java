import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("suma", "sravani", "ramya");

        names.stream().map(String::toUpperCase).map(s -> s.concat(",")).forEach(System.out::print);
    }
}