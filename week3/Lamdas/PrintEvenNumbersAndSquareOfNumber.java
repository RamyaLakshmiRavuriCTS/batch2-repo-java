import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEvenNumbersAndSquareOfNumber {
    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        PrintEvenNumbersAndSquareOfNumber obj = new PrintEvenNumbersAndSquareOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("Enter the collections");
        while (true) {
            if (sc.hasNextInt()) {
                obj.list.add(sc.nextInt());
            } else {
                break;
            }
        }
        System.out.print("Even numbers: ");
        SquareOfNumberAndCheckEvenOrOdd check=(number)->{
            if(number%2==0){
                return 1;
            }
            return 0;
        };

        obj.list.stream().filter((number)->check.squareOrCheckEvenOrOdd(number)==1).map(integer -> integer.toString().concat(",")).forEach(System.out::print);
        SquareOfNumberAndCheckEvenOrOdd s = ((number) -> num * num);
        System.out.println();
        System.out.print("Square of a number: ");
        System.out.print(s.squareOrCheckEvenOrOdd(num));
    }
}
