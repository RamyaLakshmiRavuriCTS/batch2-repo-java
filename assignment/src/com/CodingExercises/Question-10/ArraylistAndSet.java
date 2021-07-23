import java.util.ArrayList;
import java.util.Scanner;

//Main method
public class ArraylistAndSet {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
            array1.add(Integer.parseInt(scanner.nextLine()));

        for (int i = 0; i < size; i++)
            array2.add(Integer.parseInt(scanner.nextLine()));
        char character = scanner.nextLine().charAt(0);
        System.out.println(getvalues(array1, array2, character));
    }

    //Logic implementation for arraylist and set
    public static ArrayList<Integer> getvalues(ArrayList<Integer> array1,
                                               ArrayList<Integer> array2, char character) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int k = 0;
        switch (character) {
            case '+':
                array1.removeAll(array2);
                array1.addAll(array2);
                output = array1;
                break;
            case '*':
                array1.retainAll(array2);
                output = array1;
                break;
            case '-':
                for (int i = 0; i < array1.size(); i++) {
                    k = 0;
                    for (int j = 0; j < array2.size(); j++) {
                        if (array1.get(i) == array2.get(j))
                            k = 1;
                    }
                    if (k == 0)
                        output.add(array1.get(i));
                }
                break;
        }
        return output;
    }
}