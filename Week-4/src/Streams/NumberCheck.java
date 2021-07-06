package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*This class print the integer number
 * which are greater then 10
 * by using streams concept */
public class NumberCheck {
    /*Main method
     * this method print the number
     * which are greater then 10
     * used stream concept */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter n value");
        int n=sc.nextInt();
        System.out.println("Enter values");
        for(int i=0;i<n;i++){
           integerList.add(sc.nextInt());
        }
        integerList.stream().filter(integer -> integer > 10).map((Object::toString)).map(s -> s.concat(",")).forEach(System.out::print);
    }
}