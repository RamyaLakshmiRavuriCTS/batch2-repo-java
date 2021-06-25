import java.lang.FunctionalInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Functional {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        MyInterface square;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of list");
        int size = sc.nextInt();
        System.out.println("enter the values of list");
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        System.out.println("Enter the N value");
        int N = sc.nextInt();
        System.out.println("Even Numbers: ");
        list.stream().filter(n -> n%2==0).forEach(System.out::println);
        square = ()-> N*N;
        System.out.println("Square of Number: "+square.getSquare());
    }
}