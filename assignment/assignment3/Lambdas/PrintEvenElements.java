import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//functional interface
@FunctionalInterface
interface EvenNumber {
    public void checkEven(int key);
}

//functional interface
@FunctionalInterface
interface Square {
    public int square(int key);

}

public class PrintEvenElements {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = read.nextInt();
        int[] array = new int[size];
        List<Integer> numberList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
            numberList.add(array[i]);
        }
        
        EvenNumber e = (i) -> {
            if (i % 2 == 0) System.out.println(i);
        };

        System.out.println("Even numbers:");
        for (Integer value : numberList) {
            e.checkEven(value);
        }

        System.out.println("enter the key");
        int squareNumber = read.nextInt();
        Square sq = ((i) -> i * i);
        System.out.println();
        System.out.print("Square of a number: ");
        System.out.print(sq.square(squareNumber));
    }
}


