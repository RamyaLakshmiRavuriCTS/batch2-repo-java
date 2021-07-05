import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListManipulation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of input");
        int size = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        System.out.println("Enter first array");
        for (int i = 0; i < size; i++) {
            int read = input.nextInt();
            arrayList.add(read);
        }
        System.out.println("Enter second array");
        for (int i = 0; i < size; i++) {
            int read = input.nextInt();
            arrayList1.add(read);
        }
        ArrayList<Integer> result = getOddEvenList(arrayList, arrayList1);
        System.out.println(result);
    }

    public static ArrayList<Integer> getOddEvenList(ArrayList<Integer> arg1, ArrayList<Integer> arg2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arg1.size(); i++) {
            if (i % 2 == 0)
                result.add(arg2.get(i));
            else result.add(arg1.get(i));
        }
        return result;
    }
}
