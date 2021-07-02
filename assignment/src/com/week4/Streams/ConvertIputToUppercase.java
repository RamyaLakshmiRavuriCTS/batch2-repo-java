package Streams;

import java.util.Arrays;
import java.util.List;

/*This class converts the input string into Uppercase
 * by using stream concept*/
public class ConvertIputToUppercase {
    /*Main method
     * converts list of names into Uppercase
     * using streams concept*/
    public static void main(String[] args) {
        List<String> names = Arrays.asList("triveni", "sravani", "gangadhar", "sarat");
        names.stream().map(String::toUpperCase).map(s -> s.concat(",")).forEach(System.out::print);
    }
}
