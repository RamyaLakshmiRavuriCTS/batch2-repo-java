import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//main class
public class GreaterThan10 {
    //main method
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(16);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(3);
        arrayList.add(21);

        List<Integer> result = arrayList.stream().filter(s -> s > 10).
                collect(Collectors.toList());
        System.out.println(result);
    }
}
