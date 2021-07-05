import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//main class
public class NameUpperCase {
    //main method
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ramya", "naresh", "yeahwanth", "krishna");

        List<String> UpperCase = names.stream().map(x -> x.toUpperCase()).
                collect(Collectors.toList());
        System.out.println(UpperCase);
    }
}
