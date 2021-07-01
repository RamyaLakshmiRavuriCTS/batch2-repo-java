package Streams;

import java.util.Arrays;
import java.util.List;

/*This class print the integer number
 * which are greater then 10
 * by using streams concept */
public class IntegerCheckGreater10 {
    /*Main method
     * this method print the number
     * which are greater then 10
     * used stream concept */
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 5, 7, 9, 12, 45, 23, 42, 16, 24);
        integerList.stream().filter(integer -> integer > 10).map((Object::toString)).map(s -> s.concat(",")).forEach(System.out::print);
    }
}
