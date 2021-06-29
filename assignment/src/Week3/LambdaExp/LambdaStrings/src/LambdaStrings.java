import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaStrings {

    public static void main(String [] a) {

        List<Integer> list = Arrays.asList(2,45,67,33,24,88,94,356,77,12);
        int num = 5;
        double square = num*num;

        System.out.println("Print even numbers:");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.println("Square of "+ num + " is: "+ square);
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n + "  " );
            }

        }


    }


}
