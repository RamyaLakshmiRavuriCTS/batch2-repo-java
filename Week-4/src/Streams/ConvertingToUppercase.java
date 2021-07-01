package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*This class converts the input string into Uppercase
 * by using stream concept*/
public class ConvertingToUppercase {
    /*Main method
     * converts list of names into Uppercase
     * using streams concept*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        System.out.println("enter n value");
        int n = sc.nextInt();
        System.out.println("enter names");
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        names.stream().map(String::toUpperCase).map(s -> s.concat(",")).forEach(System.out::print);
    }
}
