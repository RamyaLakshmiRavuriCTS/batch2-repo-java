package Streams;

import java.util.Arrays;
import java.util.List;

/*This class print the integer number
 * which are greater then 10
 * by using streams concept */
public class integerCheckGreaterthan10 {
    /*Main method
     * this method print the number
     * which are greater then 10
     * used stream concept */
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 6, 8, 10, 20, 30,  46,  52, 27);
        integerList.stream().filter(integer -> integer > 10).map((Object::toString)).map(s -> s.concat(",")).forEach(System.out::print);
    }
}

